package structural.composite.problem;

public class FileSystem {
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Folder folder = new Folder("Documents");
        folder.addFiles(file1);
        folder.addFiles(file2);

        folder.showDetails();
    }
}
