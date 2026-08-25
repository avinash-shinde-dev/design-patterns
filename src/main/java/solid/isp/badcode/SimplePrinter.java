package solid.isp.badcode;

public class SimplePrinter implements Machine{
    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("not supported "); // this is bad design
    }

    @Override
    public void copy() {
        throw new UnsupportedOperationException("not supported "); // this is bad design
    }
}
