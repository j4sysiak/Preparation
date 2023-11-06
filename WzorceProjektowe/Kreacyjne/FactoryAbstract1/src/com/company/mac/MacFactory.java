package com.company.mac;

import com.company.IButton;
import com.company.IPanelElementFactory;
import com.company.ITextbox;

public class MacFactory implements IPanelElementFactory {

    @Override
    public IButton renderButton() {
        return new MacButton();  // zwraca konkretny element (Button)  dla Mac
    }

    @Override
    public ITextbox renderTextbox() {
        return new MacTextbox();  // zwraca konkretny element (Textbox) dla Mac
    }
}
