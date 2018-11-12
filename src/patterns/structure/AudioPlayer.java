package patterns.structure;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mMediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if (("mp3").equalsIgnoreCase(audioType)) {
            System.out.println("Playing Mp3 file :" + fileName);
        } else if (MediaAdapter.TYPE_AUDIO_VLC.equalsIgnoreCase(audioType)
                || MediaAdapter.TYPE_AUDIO_MP4.equalsIgnoreCase(audioType)) {
            mMediaAdapter = new MediaAdapter(audioType);
            mMediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid audio type: " + audioType + ", can not play " + fileName);
        }

    }
}
