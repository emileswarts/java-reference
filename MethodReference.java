interface MyFunc<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    HighTemp(int ht) { hTemp = ht; }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class MethodReference {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for(int i=0; i < vals.length; i++) 
            if(f.func(vals[i], v)) count++;
    }
    
}
