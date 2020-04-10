public class MovieFile extends FileBase implements FileInterface {

    public MovieFile(String name, String extension, String content) {
        super(name, extension, content);
    }

    @Override
    public String[] getValidExtensions() {
        String[] extensions = {"mov", "mpg"};
        return extensions;
    }
}
