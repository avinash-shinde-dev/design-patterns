package structural.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;

    private List<File> files;

    public Folder(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public void addFiles(File file){
        files.add(file);
    }

    public void showDetails(){
        System.out.println("Folder: " + this.name);
        files.forEach(File::showDetails);
    }
}
