package com.company;

public class RegisterClientView implements IMediator {

    private Checkbox checkbox;
    private Button button;
    private Input input;

    public RegisterClientView(Checkbox checkbox, Button button, Input input) {
        this.checkbox = checkbox;
        this.button = button;
        this.input = input;

        this.checkbox.setIMediator(this);
        this.button.setIMediator(this);
        this.input.setIMediator(this);
    }

    @Override
    public void notify(Component objectSendingThisEvent, String $event) {
        if ($event == "checkboxSelected") {
            this.input.saveValue();  // zdarzenie checkboxa: informujemy o tym zdarzeniu input
        } else if ($event == "click") {
            this.checkbox.saveValue();    // zdarzenie buttona: informujemy o tym zdarzeniu checkbox
        } else if ($event == "insertText") {
            this.button.render();    // zdarzenie texboxa: informujemy o tym zdarzeniu button
        }
    }
}
