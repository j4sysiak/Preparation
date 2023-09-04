package com.company.windows;

import com.company.IButton;
import com.company.IPanelElementFactory;
import com.company.ITextbox;

public class WindowsFactory implements IPanelElementFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton(); // zwraca konkretne elementy
    }

    @Override
    public ITextbox createTextbox() {
        return new WindowsTextbox();  // zwraca konkretne elementy
    }
}
