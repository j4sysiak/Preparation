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
            this.button.render();
        } else if ($event == "click") {
            this.checkbox.saveValue();
        } else if ($event == "insertText") {
            this.input.saveValue();
        }
    }
}
