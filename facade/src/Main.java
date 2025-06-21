//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SmartHome smartHome = new SmartHome();

        // Prepare the smart home for bedtime
        smartHome.prepareForBedtime();

        // Simulate waking up
        smartHome.wakeUp();

        // Simulate a security alarm trigger
        smartHome.securitySystem.triggerAlarm();

        // Reset the security alarm
        smartHome.securitySystem.resetAlarm();
    }
}