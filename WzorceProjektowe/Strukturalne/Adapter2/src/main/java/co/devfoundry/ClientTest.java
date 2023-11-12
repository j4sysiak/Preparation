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
     /*
        UKToContinentalAdapter adapter1 = new UKToContinentalAdapter(iukRadio);
        continentalSocket.plugIn(adapter1);

        ContinentalToUKAdapter adapter2 = new ContinentalToUKAdapter(icontinentalRadio);
        ukSocket.plugIn(adapter2);
      */
        //lub drugi sposób
         TwoWayAdapter adapter = new TwoWayAdapter(iukRadio, icontinentalRadio);
         ukSocket.plugIn(adapter);
    }
}
