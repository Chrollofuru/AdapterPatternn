package commandPattern;

public class MusicPlayerOffCommand implements Command {
    private MusicPlayer musicPlayer;
    public MusicPlayerOffCommand(MusicPlayer musicPlayer){ this.musicPlayer = musicPlayer; }
    @Override
    public String execute() { return musicPlayer.switchOff(); }
}