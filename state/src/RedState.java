public class RedState implements TrafficLightState{
    @Override
    public TrafficLightState switchState(TrafficLight trafficLight) {
        System.out.println("Red -> Green (Wait for 30 seconds)");
        trafficLight.setState(new GreenState());
        return null;
    }


    @Override
    public String getColor() {
        return "Red";
    }
}

