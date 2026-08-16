package creational.abstract_factory.solution;

public class MacOsScrollBar implements ScrollBar {
    @Override
    public void scroll(){
        System.out.println("Rendering MacOs Scroll bar");
    }
}
