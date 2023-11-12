package co.devfoundry.patterns.adapter;

public class ContinentalSocket {

    public void plugIn(IContinentalDevice iContinentalDevice) {
        iContinentalDevice.on();
    }
}
