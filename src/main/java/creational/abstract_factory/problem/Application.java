package creational.abstract_factory.problem;

public class Application {
    public static void main(String[] args) {

        WindowsButton button = new WindowsButton();
        WindowsScrollBar scrollBar = new WindowsScrollBar();

        button.render();
        scrollBar.scroll();

        // what are the problems
        // 1. These concrete classes are tightly coupled with the application
        // 2. WindowsButton & WindowsScrollBar are related classes as they are part
        // of one theme ( family )
        // 3. Client can pair WindowsButton and MacOsScrollBar which is wrong
        // That's where Abstract Factory pattern will help us

    }
}
