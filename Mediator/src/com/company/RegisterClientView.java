package com.company;

public class RegisterClientView implements IMediator {

    private Checkbox checkbox;
    private Button button;

    public RegisterClientView(Checkbox checkbox, Button button) {
        this.checkbox = checkbox;
        this.button = button;

        this.checkbox.setMediator(this);
        this.button.setMediator(this);

    }

    @Override
    public void notify(Component sender, String event) {
        if (event == "checkboxSelected") {
            this.button.render();
        } else if (event == "click") {
            this.checkbox.saveValue();
        }
    }
}
