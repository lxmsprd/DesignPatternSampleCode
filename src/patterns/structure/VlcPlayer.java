package patterns.structure;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc audio file:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
