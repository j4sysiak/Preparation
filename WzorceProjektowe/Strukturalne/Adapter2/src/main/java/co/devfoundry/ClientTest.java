package co.devfoundry;

import co.devfoundry.patterns.adapter.*;
import org.junit.Test;

public class ClientTest {

    @Test
    public void test() {

        ContinentalSocket continentalSocket = new ContinentalSocket();

        UKSocket ukSocket = new UKSocket();

        UKDevice ukRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("London calling to the faraway towns");
            }
        };

        ContinentalDevice continentalRadio = new ContinentalDevice() {
            public void on() {
                System.out.println("London calling to the underworld");
            }
        };


        TwoWayAdapter adapter = new TwoWayAdapter(ukRadio,continentalRadio);

        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);
    }

}
