public class TV implements IDevice{
    boolean isOn = false;
    int volume = 10;
    String brand  ;

    public TV(String brand) {
        this.brand = brand;
    }
    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
    }
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
        }
        System.out.println("TV is now OFF");

    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume is now " + volume);
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
