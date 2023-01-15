package com.company;

public class MacFactory implements IUIElementFactory {

    @Override
    public IButton createButton() {
        return new MacButton();  // zwraca konkretne elementyv
    }

    @Override
    public ITextbox createTextbox() {
        return new MacTextbox();  // zwraca konkretne elementy
    }
}
