package commandPattern;

public class PlayPlaylistCommand implements Command {
    private MusicPlayer musicPlayer;
    private String playlistName;
    public PlayPlaylistCommand(MusicPlayer musicPlayer, String playlistName){
        this.musicPlayer = musicPlayer;
        this.playlistName = playlistName;
    }
    @Override
    public String execute() { return musicPlayer.playPlaylist(playlistName); }
}