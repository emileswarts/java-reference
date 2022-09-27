interface A {
    void meth1();
    void meth2();
}

interface B extends A {
    void meth3();

}

public class InterfaceExtends implements B {
    public void meth1() {
        System.out.println("implements meth1");
    }
    public void meth2() {
        System.out.println("implements meth2");
    }

    public void meth3() {
        System.out.println("implements meth2");
    }

    public static void main(String args[]) {
        var foo = new InterfaceExtends();
        foo.meth1();
        foo.meth2();
    }
}
