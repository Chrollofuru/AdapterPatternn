package commandPattern;

public class ViewerApp {
    public static void main(String[] args) {
        
        Light livingRoomLight = new Light("Living Room");
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();
        Tv tv = new Tv();

        RemoteControl remote = new RemoteControl();

        remote.setCommand("tv_on", new PowerOn(tv));
        remote.setCommand("tv_off", new PowerOff(tv));
        
        remote.setCommand("lights_on", new LightOnCommand(livingRoomLight));
        remote.setCommand("lights_off", new LightOffCommand(livingRoomLight));
        remote.setCommand("lights_brighter", new IncreaseBrightnessCommand(livingRoomLight));
        remote.setCommand("lights_dimmer", new DecreaseBrightnessCommand(livingRoomLight));

        remote.setCommand("thermostat_on", new ThermostatOnCommand(thermostat));
        remote.setCommand("thermostat_off", new ThermostatOffCommand(thermostat));
        remote.setCommand("temp_up", new IncreaseTemperatureCommand(thermostat));
        remote.setCommand("temp_down", new DecreaseTemperatureCommand(thermostat));

        remote.setCommand("music_on", new MusicPlayerOnCommand(musicPlayer));
        remote.setCommand("music_off", new MusicPlayerOffCommand(musicPlayer));
        remote.setCommand("play_chill_playlist", new PlayPlaylistCommand(musicPlayer, "Chill Vibes"));
        remote.setCommand("volume_up", new IncreaseVolumeCommand(musicPlayer));
        remote.setCommand("volume_down", new DecreaseVolumeCommand(musicPlayer));

        System.out.println(remote.clickButton("tv_on"));
        System.out.println(remote.clickButton("lights_on"));
        System.out.println(remote.clickButton("thermostat_on"));
        System.out.println(remote.clickButton("temp_up"));
        System.out.println(remote.clickButton("music_on"));
        System.out.println(remote.clickButton("play_chill_playlist"));
        System.out.println(remote.clickButton("volume_up"));

        System.out.println(remote.clickButton("lights_off"));
        System.out.println(remote.clickButton("music_off"));
        System.out.println(remote.clickButton("thermostat_off"));
        System.out.println(remote.clickButton("tv_off"));
    }
}