package patterns.structure;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer mAdvancedMediaPlayer;
    public static final String TYPE_AUDIO_VLC = "Vlc";
    public static final String TYPE_AUDIO_MP4 = "Mp4";


    MediaAdapter(String audioType) {
        if (TYPE_AUDIO_VLC.equalsIgnoreCase(audioType)) {
            mAdvancedMediaPlayer = new VlcPlayer();
        }

        if (TYPE_AUDIO_MP4.equalsIgnoreCase(audioType)) {
            mAdvancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (TYPE_AUDIO_VLC.equalsIgnoreCase(audioType)) {
            mAdvancedMediaPlayer.playVlc(fileName);
        }

        if (TYPE_AUDIO_MP4.equalsIgnoreCase(audioType)) {
            mAdvancedMediaPlayer.playMp4(fileName);
        }
    }

}
