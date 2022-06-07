package com.company;

public class Configuration {

    private static Configuration instance = null;

    public String StringProperty;
    public String IntProperty;

    // musi być modyfikator dostępu: private
    //tylko metoda getInstance będzie miała możliwość tworzenia obiektu - tylko jednego
    private Configuration(){}

    // Zabezpieczenie, żeby był tylko jeden obiekt typu Configuration
    public static Configuration getInstatnce() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }
}
