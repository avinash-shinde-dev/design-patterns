package behavioral.memento;

// Memento -> Captures and stores the internal state of the originator
public class EditorMemento {
    private String content;
    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
