package structural.proxy.solution;

public class Client {
    public static void main(String[] args) {

        Image img1 = new ProxyImage("dog.png");
        Image img2 = new ProxyImage("cat.png");

        // since we are creating image, and loading from the disk it is expensive operation
        // Now each time it will load from disk
        // No caching support
        img1.display();  // this is where it will load the image i.e lazy loading
        img1.display(); // it will used the cached object so this operation would be faster.




    }
}
