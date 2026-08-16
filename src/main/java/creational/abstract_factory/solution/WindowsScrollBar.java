package creational.abstract_factory.solution;

public class WindowsScrollBar implements ScrollBar{
    @Override
    public void scroll(){
        System.out.println("Rendering Windows Scroll bar");
    }
}
