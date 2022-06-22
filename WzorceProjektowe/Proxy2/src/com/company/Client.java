package com.company;

import org.junit.jupiter.api.Test;

public class Client {

    //Proxy - klasa pośrednik/pełnomocnik w wywołaniu właściwej metody
    // nasz Client nie ma bezpośrednio dostępu do metod klasy ServiceImpl
    // ale za pośrednictwem klasy Proxy odpalamy metody w klasie ServiceImpl

    @Test
    public void test() {

        // IService iService = new ServiceImpl();  nie stosujemy bezpośredniego strzału do metod ServiceImpl
        // w obiekcie Proxy tworzymy dopiero obiekt klasy ServiceImpl (lazy loading) - ponieważ nie musimy tego wcześniej robić i zabierać zasoby
        // tworzymy taki obiekt jak go potrzebujemy - przy wywołaniu jego metody (w warstwie pośredniej Proxy)
        IService iService = new Proxy();
        iService.method();
    }
}
