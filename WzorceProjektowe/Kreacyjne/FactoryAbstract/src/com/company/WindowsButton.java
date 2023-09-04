package com.company;

public class WindowsButton implements IButton {

    @Override
    public void create() {
        System.out.println("Render Windows button");
    }

    @Override
    public void handleClick() {
        System.out.println("Handle Windows click event");
    }
}
