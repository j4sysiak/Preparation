package co.devfoundry.patterns.adapter;

public class TwoWayAdapter implements IUKDevice, IContinentalDevice {

    IUKDevice IUKDevice;
    IContinentalDevice device;

    public TwoWayAdapter(IUKDevice IUKDevice, IContinentalDevice device) {
        this.IUKDevice = IUKDevice;
        this.device = device;
    }

    public void on() {
       IUKDevice.powerOn();
    }

    public void powerOn() {
        device.on();
    }
}
