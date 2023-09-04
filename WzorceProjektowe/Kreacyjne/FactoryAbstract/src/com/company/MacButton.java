package com.company;

public class MacButton implements IButton {

    @Override
    public void create() {
        System.out.println("Render Mac button");
    }

    @Override
    public void handleClick() {
        System.out.println("Handle Mac click event");
    }
}
