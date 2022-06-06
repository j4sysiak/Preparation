package com.company;

public class MacFactory implements IUIElementFactory {

    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextbox createTextbox() {
        return new MacTextbox();
    }
}
