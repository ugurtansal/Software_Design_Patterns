//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AdvancedRemote remote = new AdvancedRemote(new TV("Sony"));

        remote.toggleButton(); // Turns on the TV
        remote.openNetflix(); // Opens Netflix

        remote.setVolume(20); // Sets volume to 20

        BasicRemote basicRemote = new BasicRemote(new Radio("Philips"));

        basicRemote.toggleButton(); // Turns on the Radio
        basicRemote.mute();
    }
}