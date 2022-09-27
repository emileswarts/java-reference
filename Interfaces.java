interface MyInterface {
    void foobar(int param);
}
public class Interfaces implements MyInterface {
    public void foobar(int i) {
        System.out.print("hi");
    }
    public static void main(String args[]) {
        var foo = new Interfaces();
        foo.foobar(1);
    }
}

