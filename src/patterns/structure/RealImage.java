package patterns.structure;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying file:" + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading from disk, file:" + fileName);
    }
}
