public class SmartHome {
    Light light ;
    Thermostat thermostat;
    SecuritySystem securitySystem;

    public SmartHome() {
        light = new Light();
        thermostat = new Thermostat();
        securitySystem = new SecuritySystem();
    }

    public void prepareForBedtime() {
        light.off();
        thermostat.setTemperature(20);
        securitySystem.arm();
        System.out.println("Smart home prepared for bedtime.");
    }

    public void wakeUp() {
        light.on();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        System.out.println("Smart home ready for the day.");
    }
}
