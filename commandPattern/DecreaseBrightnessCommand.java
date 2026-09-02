package commandPattern;

public class DecreaseBrightnessCommand implements Command {
    private Light light;
    public DecreaseBrightnessCommand(Light light){ this.light = light; }
    @Override
    public String execute() { return light.decreaseBrightness(); }
}