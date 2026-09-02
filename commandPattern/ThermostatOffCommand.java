package commandPattern;

public class ThermostatOffCommand implements Command {
    private Thermostat thermostat;
    public ThermostatOffCommand(Thermostat thermostat){ this.thermostat = thermostat; }
    @Override
    public String execute() { return thermostat.switchOff(); }
}