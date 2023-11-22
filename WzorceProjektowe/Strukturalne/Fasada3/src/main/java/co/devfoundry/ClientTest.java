package co.devfoundry;

import co.devfoundry.bank.AtmMachineFacade;
import org.junit.Test;

public class ClientTest {

    @Test
    public void test() {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();

    }

}
