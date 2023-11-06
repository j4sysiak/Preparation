package com.company.windows;

import com.company.IButton;
import com.company.IPanelElementFactory;
import com.company.ITextbox;

public class WindowsFactory implements IPanelElementFactory {

    @Override
    public IButton renderButton() {
        return new WindowsButton(); // zwraca konkretny element (Button)  dla Windowsa
    }

    @Override
    public ITextbox renderTextbox() {
        return new WindowsTextbox();  // zwraca konkretny element (Textbox)  dla Windowsa
    }
}
