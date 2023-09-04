package com.company;

public class WindowsButton implements IButton {

    @Override
    public void createButton() {
        System.out.println("Render Windows button");
    }

    @Override
    public void handleClickButton() {
        System.out.println("Handle Windows click event");
    }
}
