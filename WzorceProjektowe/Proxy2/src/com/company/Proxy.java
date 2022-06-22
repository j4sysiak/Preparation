package com.company;

public class Proxy implements IService {

    IService iService;

    @Override
    public void method() {
        if (iService == null) {
            iService = new ServiceImpl();
        }
        System.out.println("Hello World from Proxy!!!!! - odwołuje się do włąściwego obiektu w klasie ServiceImpl");
        iService.method();
    }
}
