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

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Client {
    static Map<Integer, byte[]> _cache = new Hashtable() {};
    static {
        _cache.put(100, new byte[]{1, 2, 34});
        _cache.put(101, new byte[]{2, 90, 77});
    }
/*
    entrySet() – returns a collection-view of the map, whose elements are from the Map.Entry class. The entry.getKey() method returns the key, and entry.getValue() returns the corresponding value
    keySet() – returns all keys contained in this map as a Set
    values() – returns all values contained in this map as a Set
*/

    @Test
    public void usingEntrySet() {
        for (Map.Entry<Integer, byte[]> entry : _cache.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void usingKeySet() {
        for (Integer key : _cache.keySet()) {
            System.out.println(key + ":" + _cache.get(key));
        }
    }

    @Test
    public void iteratingOverValuesUsingValues() {
        for (byte [] value : _cache.values()) {
            System.out.println(value);
        }
    }

    @Test
    public void iterateUsingIteratorAndEntry() {
        Iterator<Map.Entry<Integer, byte[]>> iterator = _cache.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, byte[]> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void iterateUsingIteratorAndKeySet() {
        Iterator<Integer> iterator = _cache.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + ":" + _cache.get(key));
        }
    }

    @Test
    public void iterateUsingIteratorAndValues() {
        Iterator<byte[]> iterator = _cache.values().iterator();
        while (iterator.hasNext()) {
            byte[] bytes = iterator.next();
            System.out.println("value :" + bytes);
        }
    }

    @Test
    public void iterateUsingLambda() {
        _cache.forEach((k, v) -> System.out.println((k + ":" + v)));
    }

    @Test
    public void iterateByKeysUsingLambda() {
        _cache.keySet().forEach(k -> System.out.println((k + ":" + _cache.get(k))));
    }

    @Test
    public void iterateValuesUsingLambda() {
        _cache.values().forEach(v -> System.out.println(("value: " + v)));
    }

    @Test
    public void iterateUsingStreamAPI() {
        _cache.entrySet().stream()
                // ... some other Stream processings
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}























