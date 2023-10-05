package com.company;

public class RegisterClientView implements IMediator {

    //to jest klasa mediatora

    private Checkbox checkbox;
    private Button button;
    private Input input;

    public RegisterClientView(Checkbox checkbox, Button button, Input input) {
        this.checkbox = checkbox;
        this.button = button;
        this.input = input;

        this.checkbox.setIMediator(this); // bo pole iMediator w klasie Component jest protected
        this.button.setIMediator(this);  // bo pole iMediator w klasie Component jest protected
        this.input.setIMediator(this);  // bo pole iMediator w klasie Component jest protected
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
