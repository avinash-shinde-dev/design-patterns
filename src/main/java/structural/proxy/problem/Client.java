package structural.proxy.problem;

public class Client {
    public static void main(String[] args) {

        Image img1 = new RealImage("dog.png");
        Image img2 = new RealImage("cat.png");

        // since we are creating image, and loading from the disk it is expensive operation
        // Now each time it will load from disk
        // No caching support
        img1.display();
        img1.display();  // Now it will again go and do the expensive operations.


    }
}
