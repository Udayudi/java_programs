
// constructor overload

class volume {
    int lenght;
    int breadth;
    int height;

    volume (int l, int b, int h) {
        lenght = l;
        breadth = b;
        height = h;
    } // Constructor with 3 parameters


    volume (int d) {
        lenght = breadth = height = d;
        // constructor with 1 parameter
    }

    int cubic () {
        int cArea = lenght*breadth*height;
        return(cArea);
    } // method to compute volume of a cube/cuboid
} // end of class definition : volume


class cube {
    public static void main (String args[]) {
        int cft1, cft2;
        volume cb1 = new volume(2,4,6);
        cft1=cb1.cubic();


        System.out.println("Volume of a cubid=" + cft1);
        volume cb2  = new volume(2);

        cft2 = cb2.cubic();
        System.out.println("Volume of a CUBE = " +cft2);
    }
}