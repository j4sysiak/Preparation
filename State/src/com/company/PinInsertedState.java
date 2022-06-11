package com.company;

public class PinInsertedState extends State {

    protected PinInsertedState(Context context) {
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
        System.out.println("You have allready inserted correct PIN");
    }

    @Override
    public void withdrawalCash(int amount) {
        if (amount > context.availebleCash) {
            System.out.println("That amount of cash is not available");
        } else {
            System.out.println("You have withdrawal " + amount + " from the machine");
            context.availebleCash -= amount;
            if (context.availebleCash == 0) {
                //context changeState NoCashState
            } else {
                System.out.println("Card ejected");
                //context changeState to NoCardState
            }
        }
    }
}
