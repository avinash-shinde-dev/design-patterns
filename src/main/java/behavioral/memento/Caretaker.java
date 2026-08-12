package behavioral.memento;

import java.util.Stack;

// manages and stores the mementos without modifying them
public class Caretaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor){
        history.push(editor.save());
    }

    public void undo(TextEditor editor){
        if(!history.empty()){
            history.pop();
            editor.restore(history.peek());
        }
    }
}
