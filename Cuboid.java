
import java.util.Scanner;

class Innercubiod {
    double height;
    double breadth;
    double length;

    void setDimenstion(double l, double w, double h) {
        length = l;
        breadth = w;
        height = h;
    }

    public double calculateVolume() {
        return length * height * breadth;
    }

    public double calculateSurfaceArea() {
        return 2 * (length * breadth + breadth * height + length * height);
    }
}

public class Cuboid {
    public static void main(String[] args) {
        System.err.println("Enter the Length,breadth,Height: ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();
        Innercubiod mybox = new Innercubiod();
        mybox.setDimenstion(length, breadth, height);

        double volume = mybox.calculateVolume();
        System.err.println("Volume of the cuboid with dimensions: " + length + " * " + breadth + " * " + height
                + " is :" + volume);

        double surfaceArea = mybox.calculateSurfaceArea();
        System.err.println("Surface area of box: " + surfaceArea);
    }
}
