package co.devfoundry;

import org.junit.Test;

public class ClientTest {

    @Test
    public void test (){

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.insertTheCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();

    }

}
