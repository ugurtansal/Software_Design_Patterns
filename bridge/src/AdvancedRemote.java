public class AdvancedRemote extends Remote{
    public AdvancedRemote(IDevice device) {
        super(device);
    }

    public void setChannel(int channel) {
        // Assuming IDevice has a method to set the channel
        // device.setChannel(channel);
        System.out.println("Setting channel to " + channel);
    }

    public void setMaxVolume() {
        device.setVolume(100);
        System.out.println("Setting volume to maximum (100)");
    }

    public void openNetflix() {
        System.out.println("Opening Netflix");
    }
}
