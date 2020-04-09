public class MusicFile extends FileBase implements FileInterface {
    private final float duration;

    public MusicFile(String name, String extension, String content, float duration) {
        super(name, extension, content);
        this.duration = duration;
    }

    @Override
    public String[] getValidExtensions() {
        String[] extensions = {"mp3", "wav"};
        return extensions;
    }
}
