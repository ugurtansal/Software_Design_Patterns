public class CelcsiusToFahrenheitAdapter implements Fahrenheit {
    private Celsius celsiusTemperature;

    public CelcsiusToFahrenheitAdapter(Celsius celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    @Override
    public double covertToFahrenheit(double celsius) {
        return (celsiusTemperature.getCelsiusTemperature() * 1.8) + 32.0 ;
    }
}
