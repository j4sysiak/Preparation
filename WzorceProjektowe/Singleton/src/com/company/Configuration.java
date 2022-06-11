package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class Configuration {

    private static Configuration instance = null;
    static ReentrantLock lock = new ReentrantLock();

    public String StringProperty;
    public String IntProperty;

    // musi być modyfikator dostępu: private
    // tylko metoda getInstance będzie miała możliwość tworzenia obiektu - tylko jednego
    private Configuration(){}

    // Zabezpieczenie, żeby był tylko jeden obiekt typu Configuration
    public static Configuration getInstatnce() {

        lock.lock ();
        try {
            if (instance == null) {
                instance = new Configuration();
            }
            return instance;
        } finally {
            lock.unlock();
        }
    }
}
