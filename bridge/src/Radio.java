public class Radio implements IDevice {
    boolean isOn = false;
    int volume = 10;
    String brand;

    public Radio(String brand) {
        this.brand = brand;
    }
    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;

        }
        System.out.println("Radio is now ON");
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
        }
        System.out.println("Radio is now OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume is now " + volume);

    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
