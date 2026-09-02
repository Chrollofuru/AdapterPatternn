package commandPattern;

public class IncreaseBrightnessCommand implements Command {
    private Light light;
    public IncreaseBrightnessCommand(Light light){ this.light = light; }
    @Override
    public String execute() { return light.increaseBrightness(); }
}