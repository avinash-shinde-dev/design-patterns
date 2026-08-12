package behavioral.memento;

/**
 * A text editor where user can undo changes, such as text addition, deletion or
 * formatting. The editor stores the snapshots of it's state ( text content )
 * after each change, enabling user to revert to previous states.
 */

// Originator -> Object whose state needs to be saved and restored
public class TextEditor {
    private String content;

    public String getContent() {
        return content;
    }

    public void write(String content) {
        this.content = content;
    }

    public EditorMemento save() {
        return new EditorMemento(this.content);
    }

    public void restore(EditorMemento editorMemento){
        this.content = editorMemento.getContent();
    }
}
