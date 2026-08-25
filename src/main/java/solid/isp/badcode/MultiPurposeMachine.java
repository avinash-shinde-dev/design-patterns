package solid.isp.badcode;

public class MultiPurposeMachine implements Machine{

    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void scan() {
        System.out.println("scan");
    }

    @Override
    public void copy() {
        System.out.println("copy");
    }
}
