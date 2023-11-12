package co.devfoundry.patterns.adapter;

public class UKSocket {

    public void plugIn(IUKDevice device) {
        device.powerOn();
    }
}
