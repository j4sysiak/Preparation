package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class A {

    @Autowired
    IC ic;

    public void sendMessage(String s) {
        ic.sendMessage("Hello from A");
    }

}
