class TemperatureSensorAdapter implements TemperatureSensor {
    private final FahrenheitSensor fahrenheitSensor;

    public TemperatureSensorAdapter(FahrenheitSensor fahrenheitSensor) {

        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperatureInCelsius() {
        double fahrenheit = fahrenheitSensor.getTemperatureInFahrenheit();
        return (fahrenheit - 32) * 5.0 / 9.0; // Konverterer Fahrenheit til Celsius
    }
}