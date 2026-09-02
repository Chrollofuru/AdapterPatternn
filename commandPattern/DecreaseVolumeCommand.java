package commandPattern;

public class DecreaseVolumeCommand implements Command {
    private MusicPlayer musicPlayer;
    public DecreaseVolumeCommand(MusicPlayer musicPlayer){ this.musicPlayer = musicPlayer; }
    @Override
    public String execute() { return musicPlayer.decreaseVolume(); }
}