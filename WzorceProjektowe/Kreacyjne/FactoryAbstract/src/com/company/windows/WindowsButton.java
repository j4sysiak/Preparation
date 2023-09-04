package com.company.windows;

import com.company.IButton;

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
