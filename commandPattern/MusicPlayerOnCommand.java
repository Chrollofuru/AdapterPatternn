package commandPattern;

public class MusicPlayerOnCommand implements Command {
    private MusicPlayer musicPlayer;
    public MusicPlayerOnCommand(MusicPlayer musicPlayer){ this.musicPlayer = musicPlayer; }
    @Override
    public String execute() { return musicPlayer.switchOn(); }
}