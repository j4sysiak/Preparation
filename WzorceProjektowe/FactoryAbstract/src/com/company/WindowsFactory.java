package com.company;

public class WindowsFactory implements IUIElementFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextbox createTextbox() {
        return new WindowsTextbox();
    }
}
