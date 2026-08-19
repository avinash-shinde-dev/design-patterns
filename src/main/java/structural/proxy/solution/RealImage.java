package structural.proxy.solution;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk(fileName); // expensive operation
    }

    private void loadImageFromDisk(String fileName) {
        System.out.println("Loading from disk ... !" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying the real image." + this.fileName);
    }
}
