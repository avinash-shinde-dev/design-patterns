package solid.lsp.badcode;

public class ReadOnlyFile extends File{
    @Override
    public void read() {
        System.out.println("Reading from file ...");
    }

    @Override
    public void write() {
        throw new UnsupportedOperationException("Not allowed to write in the file");
    }
}
