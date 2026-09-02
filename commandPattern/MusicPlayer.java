package commandPattern;

public class MusicPlayer {
    private int volume = 30;

    public String switchOn() {
        return "Music player turned ON";
    }

    public String switchOff() {
        return "Music player turned OFF";
    }

    public String playPlaylist(String playlistName) {
        return "Now playing playlist \"" + playlistName + "\"";
    }

    public String increaseVolume() {
        volume = Math.min(100, volume + 10);
        return "Volume increased to " + volume;
    }

    public String decreaseVolume() {
        volume = Math.max(0, volume - 10);
        return "Volume decreased to " + volume;
    }
}