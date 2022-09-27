class Example {
    public static void main(String args[]) {
        System.out.println("This is a simple java program");

    }
}

class Example2 {
    public static void main(String args []) {
        int num; 
        num = 100;
        System.out.println("This is num: " + num);

        num = num * 2;

        System.out.println("The value of num * 2 is:" );
        System.out.println(num);
    }
}

class IfSample {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x is less than y");

        x = x * 2;

        if(x == y) System.out.println("x is equal to y");
        x = x * 2;
        if (x > y) System.out.println("x is now greater than y");

        if(x == y) System.out.println("you won't see this");
    }
}

class ForTest {
    public static void main(String args[]) {
        int x;

        for(x = 0; x<10; x++) {
            System.out.println(x);
        }

    }
}

class CharDemo {
    public static void main(String args[]) {
        char x = 'X';

        x++;
        x++;

        System.out.println(x);
    }
}