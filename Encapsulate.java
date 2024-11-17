/* Here, Box uses a constructor to initialize the dimensions of a box. */
class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        // Declare, allocate, and initialize Box objects
        Box mybox = new Box();
        double vol;

        // Get volume of box
        vol = mybox.volume();
        System.out.println("Volume is " + vol);
    }
}
