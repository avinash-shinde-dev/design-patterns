package solid.lsp.goodcode;

import java.io.IOException;
import java.nio.CharBuffer;

public class ReadOnlyFile extends File implements java.lang.Readable {
    @Override
    public void read() {
        System.out.println("Reading from read only file");
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
