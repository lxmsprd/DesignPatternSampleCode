package patterns.structure;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // do nothing. may need to be removed
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 audio file:" + fileName);
    }

}
