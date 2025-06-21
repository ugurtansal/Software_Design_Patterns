public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedState(); // Initial state is Red
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void switchState() {
        state.switchState(this);
    }

    public String getColor() {
        return state.getColor();
    }

}
