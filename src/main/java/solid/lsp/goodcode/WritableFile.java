package solid.lsp.goodcode;

public class WritableFile extends ReadOnlyFile implements Writeable{
    @Override
    public void write() {
        System.out.println("You are able to write in th");
    }
}
