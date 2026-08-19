package structural.proxy.problem;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    private void loadImageFromDisk(String fileName) {
        System.out.println("Loading from disk ... !" + fileName);
    }

    @Override
    public void display() {
        loadImageFromDisk(fileName); // expensive operation
        System.out.println("Displaying the real image." + this.fileName);
    }
}
