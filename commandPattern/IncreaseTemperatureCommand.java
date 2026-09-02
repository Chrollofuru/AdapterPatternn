package commandPattern;

public class IncreaseTemperatureCommand implements Command {
    private Thermostat thermostat;
    public IncreaseTemperatureCommand(Thermostat thermostat){ this.thermostat = thermostat; }
    @Override
    public String execute() { return thermostat.increaseTemperature(); }
}