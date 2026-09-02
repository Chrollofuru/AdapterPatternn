package commandPattern;

public class Light {
    private String location;
    private int brightness = 0;

    public Light(String location) {
        this.location = location;
    }

    public String switchOn() {
        brightness = 80;
        return location + " light turned ON (brightness: " + brightness + "%)";
    }

    public String switchOff() {
        brightness = 0;
        return location + " light turned OFF";
    }

    public String increaseBrightness() {
        brightness = Math.min(100, brightness + 20);
        return location + " light brightness increased to " + brightness + "%";
    }

    public String decreaseBrightness() {
        brightness = Math.max(0, brightness - 20);
        return location + " light brightness decreased to " + brightness + "%";
    }
}