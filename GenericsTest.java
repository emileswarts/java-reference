class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getobj() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}

class GenericsTest {
    public static void main(String args[]) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();

        int v = iOb.getobj();
        System.out.println("value: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<String> ("Generics Test");
        strOb.showType();

        String str = strOb.getobj();
        System.out.println("value: " + str);
    }
    
}
