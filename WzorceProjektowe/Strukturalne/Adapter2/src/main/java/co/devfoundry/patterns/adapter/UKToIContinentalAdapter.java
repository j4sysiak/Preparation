package co.devfoundry.patterns.adapter;

public class UKToIContinentalAdapter implements IContinentalDevice {

    IUKDevice device;

    public UKToIContinentalAdapter(IUKDevice device) {
        this.device = device;
    }

    public void on() {
        device.powerOn();
    }
}

