import java.util.function.IntConsumer;

class innerInterface {
    public interface Buyable {
        public static void buy(int i) {};
    }

    public static void main(String args[]) {
        var foobar = new SomeClass();
       System.out.println(foobar);
    }
    
}


class SomeClass implements innerInterface.Buyable {
    public static void buy(int i) {
        System.out.println("Hello");
    }
}