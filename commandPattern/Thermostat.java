package commandPattern;

public class Thermostat {
    private double temperature = 21.0;

    public String switchOn() {
        return "Thermostat turned ON (current target: " + temperature + "°C)";
    }

    public String switchOff() {
        return "Thermostat turned OFF";
    }

    public String increaseTemperature() {
        temperature += 1.0;
        return "Temperature increased to " + temperature + "°C";
    }

    public String decreaseTemperature() {
        temperature -= 1.0;
        return "Temperature decreased to " + temperature + "°C";
    }
}