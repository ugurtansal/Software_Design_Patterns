public class YellowState implements TrafficLightState {
    @Override
    public TrafficLightState switchState(TrafficLight trafficLight) {
        System.out.println("Yellow -> Red (Wait for 30 seconds)");
        trafficLight.setState(new RedState());
        return null;
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}
