package com.company;

/*
Strukturalny wzorzec projektowy, którego celem jest stworzenie obiektu zastępczego w miejsce innego obiektu.
Pełnomocnik kontroluje dostęp do pierwotnego obiektu umożliwiając wykonanie czynności po lub przed przekazaniem do niego zapytania.
Przykład:
W naszej aplikacji korzystamy z obiektów zużywających dużo zasobów np. jakiś zewnętrzny serwis korzystający z zewnętrznych bibliotek np. YouTubeService (uruchamianie filmików z Youtuba na podstawie id).
Chcemy, aby dostęp do takich obiektów był kontrolowany i przyznany tylko wtedy, kiedy jest nam potrzebny.
Możemy w naszej aplikacji z różnych miejsc strzelić do usługi YouTubeService z tym samym id.
W takim przypadku usługa YouTubeService będzie musiała kilkakrotnie zrobić to samo i zużyć wielkrotnie dużo zasobów mimo tego, że video będzie takie samo (bo strzelamy z takim samym id).
Rozwiązaniem tego problemu jest wprowadzenie obiektu Proxy, który będzie korzystał z usługi YouTubeService w sposób kontrolowany przez co możemy dopisać własną logikę przed lub po wywołaniu metody do pobrania video.
Taką logiką mogłoby być zapisanie w słowniku lub pamięci tego konkretnego video, abyśmy nie musieli za każdym razem pobierać go ponownie poprzez YouTubeService.
Innym zastosowaniem Proxy, mogłoby być kontrolowanie dostępu do zasobu.

Zewnętrzny zasób:
Klasa YouTubeService oraz interfejs IYouTubeService która ona implementuje.
W interfejsie mamy definicję tylko jednej metody getVideo wywołanej z parametrem id video i zwracającej tablicę bajtów byte[] getVideo (id)
byte[] getVideo(int id);
Klasa Proxy YouTubeService, która implementuje ten sam service i dodatkowo będzie agregować ten konkretny YouTubeService.
Client: korzysta z abstrakcji IYouTubeService nie wiedząc, że korzysta z naszego Proxy, które ułatwi pracę i zoptymalizuje pracę.
W tym przykładzie zadaniem naszego Proxy będzie udostępnienie tego samego interfejsu jakim jest pobranie video z tym, że w sposób kontrolowany tzn. jeżeli już mamy w pamięci video pod danym id to nie pobieramy go ponownie, tylko wysyłamy te z pamięci.
*/

import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void test() {

        // bez Proxy
        YouTubeService youTubeService = new YouTubeService();
//        youTubeService.getVideo(10);
//        youTubeService.getVideo(10);

        // z Proxy
        ProxyYouTubeService proxyYouTubeService = new ProxyYouTubeService(youTubeService);
        proxyYouTubeService.getVideo(11);
        proxyYouTubeService.getVideo(101);
    }

}
