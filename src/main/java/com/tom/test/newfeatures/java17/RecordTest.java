package com.tom.test.newfeatures.java17;

//java.lang.Record is the common base class of all Java language record classes
public class RecordTest {

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        System.out.println(point1.toString());
        Point point2 = Point.of(2, 3);
        System.out.println(point1.x() - point2.y());
    }
}

record Point(int x, int y) {
    public Point {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("Point Constructed. x=" + x + ",y=" + y);
    }

    public static Point of() {
        return new Point(0, 0);
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }
}
