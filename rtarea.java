class triangle {
    int base;
    int height;

    triangle() {
        base = 1;
        height = 2;
    }

    triangle (int m, int n) {
        base = m;
        height = n;
    }

    double area() {
        double aot;
        aot = 0.5;
        return(aot);
    }
}

class rtarea {
    public static void main(String args[]) {
        double rt1, rt2;
        triangle t1 = new triangle();

        rt1 = t1.area();

        System.out.println("Area of Triangle with Defualt values = " +rt1);

        triangle t2 = new triangle(4, 8);

        rt2 = t2.area();

        System.out.println("Area of Triangle with Argument Values = " +rt2);
    }
}