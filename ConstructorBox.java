class Boxa {
    double width;
    double height;
    double depth;

    Boxa(double w, double h, double d) {
        System.out.println("Constructing box");
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    double volume() {
        return this.width * this.height * this.depth;
    }

}

public class ConstructorBox {
    public static void main(String args[]) {
        Boxa mybox1 = new Boxa(10, 20, 30);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
    }
}
