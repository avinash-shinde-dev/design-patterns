package solid.isp.badcode;

// Now this violates the ISP & SRP as well.
public interface Machine {

    void print();
    void scan();
    void copy();
}
