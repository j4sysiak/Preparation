package com.company;

public class CardInsertedState extends State {

    protected CardInsertedState(Context context) {
        super(context);
    }

    @Override
    public void insertCard() {
        System.out.println("You have allready inserted a card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        //context changeState NoCardState
    }

    @Override
    public void insertPin(int pin) {
        if (pin == 8888) {
            System.out.println("Correct PIN inserted");
            //context changeState to PinInsertedState
        } else {
            System.out.println("Incorrect PIN inserted");
            //context changeState NoCardState
        }
    }

    @Override
    public void withdrawalCash(int amount) {
        System.out.println("Insert Pin first.");
    }
}
