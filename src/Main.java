public class Main {
    public static void main(String[] args) {

        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();
        TemperatureSensor sensor = new TemperatureSensorAdapter(fahrenheitSensor);
        System.out.println("Current Temperature in Celsius: " + sensor.getTemperatureInCelsius());
    }
}