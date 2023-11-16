package co.devfoundry;

import co.devfoundry.patterns.adapter.*;
import org.junit.Test;

public class ClientTest {

    @Test
    public void test() {

        IContinentalDevice icontinentalRadio = new IContinentalDevice() {
            public void on() {
                System.out.println("Gra muzyka");
            }
        };
        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(icontinentalRadio);

        IUKDevice iukRadio = new IUKDevice() {
            public void powerOn() {
                System.out.println("London calling to the underworld");
            }
        };
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(iukRadio);



        // pierwszy sposób: oddzielne  adaptery  dla każdej strony oddzielnie: UKToContinentalAdapter i ContinentalToUKAdapter
        UKToContinentalAdapter uKToContinentalAdapter = new UKToContinentalAdapter(iukRadio); //  angielski adapter dostaje kontynentalna wtyczke
        continentalSocket.plugIn(uKToContinentalAdapter);  // do kontynentalnego gniazdka wpinamy adapter z angielska wtyczka

        ContinentalToUKAdapter continentalToUKAdapter = new ContinentalToUKAdapter(icontinentalRadio);  //  kontynentalny adapter dostaje angielska wtyczke
        ukSocket.plugIn(continentalToUKAdapter);  // do angielskiego gniazdka wpinamy adapter z kontynentalna wtyczka



        //lub drugi sposób, jeden adapter dla dwóch stron: TwoWayAdapter
         TwoWayAdapter adapter = new TwoWayAdapter(iukRadio, icontinentalRadio);
         continentalSocket.plugIn(adapter);
         ukSocket.plugIn(adapter);
    }
}
