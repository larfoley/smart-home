public class FileBase {
    private String name;
    private String extension;
    private String content;

    public FileBase(String name, String extension, String content) {
        this.name = name;
        this.extension = extension;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public String getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
