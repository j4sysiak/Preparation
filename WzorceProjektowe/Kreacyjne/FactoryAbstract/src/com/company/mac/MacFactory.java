package com.company.mac;

import com.company.IButton;
import com.company.IPanelElementFactory;
import com.company.ITextbox;

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
