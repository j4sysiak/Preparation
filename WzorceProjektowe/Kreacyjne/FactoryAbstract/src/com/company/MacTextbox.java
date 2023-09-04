package com.company;

public class MacTextbox implements ITextbox {

    @Override
    public void create() {
        System.out.println("Render Mac textbox");
    }

    @Override
    public void handleInput() {
        System.out.println("Handle Mac text input");
    }
}
