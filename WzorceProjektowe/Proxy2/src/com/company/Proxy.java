package com.company;

public class Proxy implements IService {

    IService iService = new ServiceImpl();

    @Override
    public void method() {
        System.out.println("Hello World from Proxy!!!!! - odwołuje się do włąściwego obiektu w klasie ServiceImpl");
        iService.method();
    }
}
