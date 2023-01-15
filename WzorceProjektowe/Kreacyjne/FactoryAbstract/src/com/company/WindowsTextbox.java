package com.company;

public class WindowsTextbox implements ITextbox {

    @Override
    public void render() {
        System.out.println("Render Windows textbox");
    }

    @Override
    public void handleInput() {
        System.out.println("Handle Windows text input");
    }
}
