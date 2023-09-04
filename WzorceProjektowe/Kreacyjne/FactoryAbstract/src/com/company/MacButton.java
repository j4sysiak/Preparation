package com.company;

public class MacButton implements IButton {

    @Override
    public void createButton() {
        System.out.println("Render Mac button");
    }

    @Override
    public void handleClickButton() {
        System.out.println("Handle Mac click event");
    }
}
