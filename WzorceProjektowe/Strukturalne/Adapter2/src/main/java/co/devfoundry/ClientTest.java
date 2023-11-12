package co.devfoundry;

import co.devfoundry.patterns.adapter.*;
import org.junit.Test;

public class ClientTest {

    @Test
    public void test() {

        ContinentalSocket continentalSocket = new ContinentalSocket();
        UKSocket ukSocket = new UKSocket();

        IUKDevice iukRadio = new IUKDevice() {
            public void powerOn() {
                System.out.println("London calling to the faraway towns");
            }
        };

        IContinentalDevice icontinentalRadio = new IContinentalDevice() {
            public void on() {
                System.out.println("London calling to the underworld");
            }
        };

        // TwoWayAdapter adapter = new TwoWayAdapter(iukRadio, icontinentalRadio);
        UKToContinentalAdapter adapter1 = new UKToContinentalAdapter(iukRadio);
        ContinentalToUKAdapter adapter2 = new ContinentalToUKAdapter(icontinentalRadio);


        continentalSocket.plugIn(adapter1);
        ukSocket.plugIn(adapter2);
       // ukSocket.plugIn(adapter);
    }

}
