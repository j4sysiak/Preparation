package com.company;

public class MacTextbox implements ITextbox {

    @Override
    public void createTextbox() {
        System.out.println("Render Mac textbox");
    }

    @Override
    public void handleTextboxInput() {
        System.out.println("Handle Mac text input");
    }
}
