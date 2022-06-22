package com.company;

import org.junit.jupiter.api.Test;

public class Client {

    //Proxy - klasa pośrednik/pełnomocnik w wywołaniu właściwej metody
    // nasz Client nie ma bezpośrednio dostępu do metod klasy ServiceImpl
    // ale za pośrednictwem klasy Proxy odpalamy metody w klasie ServiceImpl

    @Test
    public void test() {

        IService iService = new Proxy();
        iService.method();
    }
}
