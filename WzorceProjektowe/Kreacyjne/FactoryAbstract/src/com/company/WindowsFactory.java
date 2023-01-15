package com.company;

public class WindowsFactory implements IUIElementFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton(); // zwraca konkretne elementy
    }

    @Override
    public ITextbox createTextbox() {
        return new WindowsTextbox();  // zwraca konkretne elementy
    }
}
