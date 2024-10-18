package StringsDemo;

public class GetFileDetails {
    String path;
    char pathSeparator,extensionSeparator;
    public GetFileDetails(String path,char pathSeparator,char extensionSeparator) {
        this.path = path;
        this.pathSeparator = pathSeparator;
        this.extensionSeparator = extensionSeparator;
    }
    public String getPath() {
        int l = path.lastIndexOf(pathSeparator);
        return path.substring(0,l);
    }

    public String getFileExtension() {
        int dot = path.lastIndexOf(extensionSeparator);
        return path.substring(dot+1);
    }
    public String getFileName() {
        int dot = path.lastIndexOf(extensionSeparator);
        int sep = path.lastIndexOf(pathSeparator);
        return path.substring(sep+1,dot);
    }
}
