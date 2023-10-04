package com.company;

public class RegisterClientView implements IMediator {

    //to jest klasa mediatora

    private Checkbox checkbox;
    private Button button;
    private Input input;

    public void setCheckbox(Checkbox checkbox) {
        this.checkbox = checkbox;
        this.checkbox.setIMediator(this);
    }

    public void setButton(Button button) {
        this.button = button;
        this.button.setIMediator(this);
    }

    public void setInput(Input input) {
        this.input = input;
        this.input.setIMediator(this);
    }

    //  konkretna implementacja mediatora poprzez klasę RegisterClientView
    public void registerMediator(Checkbox checkbox, Button button, Input input) {
        setCheckbox(checkbox);
        setButton(button);
        setInput(input);
    }

    @Override
    public void notify(Component objectSendingThisEvent, String $event) {
        if ($event == "checkboxSelected") {
            this.input.saveValue();  // zdarzenie checkboxa: informujemy o tym zdarzeniu input
        } else if ($event == "click") {
            this.checkbox.render();    // zdarzenie buttona: informujemy o tym zdarzeniu checkbox
            this.button.render();         // zdarzenie texboxa: informujemy o tym zdarzeniu button
            this.input.render();  // zdarzenie checkboxa: informujemy o tym zdarzeniu input
        } else if ($event == "insertText") {
            this.button.render();    // zdarzenie texboxa: informujemy o tym zdarzeniu button
        }
    }
}
