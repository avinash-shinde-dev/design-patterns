package creational.abstract_factory.solution;

public class MacOsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacOsScrollBar();
    }
}
