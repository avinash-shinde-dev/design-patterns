package creational.abstract_factory.solution;

public class Application {
    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }

    public void renderUI(){
        this.button.render();
        this.scrollBar.scroll();
    }

    public static void main(String[] args) {

//        UIFactory factory = new WindowsFactory();
//        Application application = new Application(factory);
//        application.renderUI();

        // Now if I want to changed the theme, we can simply changed the factory

        UIFactory factory = new MacOsFactory();
        Application application = new Application(factory);
        application.renderUI();

    }
}
