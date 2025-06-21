public abstract class Remote {
    IDevice device;


    public Remote(IDevice device) {
        this.device = device;
    }

    public void toggleButton() {
        if (device.isOn()){
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }


}
