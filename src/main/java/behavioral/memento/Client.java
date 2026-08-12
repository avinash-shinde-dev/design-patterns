package behavioral.memento;

public class Client {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.write("hello world");
        caretaker.saveState(editor);
        editor.write("my name is avinash");
        caretaker.saveState(editor);
        // Now I want to undo this changes ... !
        System.out.println(editor.getContent());
        System.out.println("After performing undo operation .. !");
        caretaker.undo(editor);

        System.out.println(editor.getContent());

    }
}
