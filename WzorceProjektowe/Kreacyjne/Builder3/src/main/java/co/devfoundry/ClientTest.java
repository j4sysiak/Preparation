package co.devfoundry;

public class ClientTest {

    @org.junit.Test
    public void test() {

        FlightLeg leg = new FlightLeg
                .FlightLegBuilder("Las Vegas","Los Angeles")
                .build();
        System.out.println(leg);
    }
}
