public class GreenState implements TrafficLightState{
    @Override
    public TrafficLightState switchState(TrafficLight trafficLight) {
        System.out.println("Green -> Yellow (Wait for 30 seconds)");
        trafficLight.setState(new YellowState());
        return null;
    }

    @Override
    public String getColor() {
        return "Green";
    }

}