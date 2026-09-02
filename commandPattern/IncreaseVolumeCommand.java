package commandPattern;

public class IncreaseVolumeCommand implements Command {
    private MusicPlayer musicPlayer;
    public IncreaseVolumeCommand(MusicPlayer musicPlayer){ this.musicPlayer = musicPlayer; }
    @Override
    public String execute() { return musicPlayer.increaseVolume(); }
}