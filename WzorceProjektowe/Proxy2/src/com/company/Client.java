package com.company;

import org.junit.jupiter.api.Test;

public class Client {

    //Proxy - klasa pośrednik/pełnomocnik w wywołaniu właściwej metody

    @Test
    public void test() {

        IService iService = new ServiceImpl();
        iService.method();
    }
}
