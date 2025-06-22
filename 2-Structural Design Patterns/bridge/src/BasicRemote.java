public class BasicRemote extends Remote{
    public BasicRemote(IDevice device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

}
