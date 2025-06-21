public interface TrafficLightState {
    TrafficLightState switchState(TrafficLight trafficLight);
    String getColor();

}
