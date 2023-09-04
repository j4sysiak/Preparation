package com.company;

import java.awt.*;

public class MacFactory implements IPanelElementFactory {

    @Override
    public IButton createButton() {
        return new MacButton();  // zwraca konkretne elementyv
    }

    @Override
    public ITextbox createTextbox() {
        return new MacTextbox();  // zwraca konkretne elementy
    }
}
