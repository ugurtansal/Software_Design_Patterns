//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 6; i++) {
            trafficLight.getColor();
            trafficLight.switchState();
            System.out.println();
        }
    }
}