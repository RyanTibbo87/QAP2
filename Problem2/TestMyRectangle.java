package Problem2;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 4);
        MyPoint bottomRight = new MyPoint(5, 1);
        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);
        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Area of Rectangle 1: " + rectangle1.getArea());
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());

        MyRectangle rectangle2 = new MyRectangle(2, 6, 8, 3);
        System.out.println("Rectangle 2: " + rectangle2);
        System.out.println("Area of Rectangle 2: " + rectangle2.getArea());
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.getPerimeter());

        rectangle2.setTopLeft(new MyPoint(0, 7));
        rectangle2.setBottomRight(new MyPoint(6, 2));
        System.out.println("Modified Rectangle 2: " + rectangle2);
        System.out.println("Area of Modified Rectangle 2: " + rectangle2.getArea());
        System.out.println("Perimeter of Modified Rectangle 2: " + rectangle2.getPerimeter());
    }
}
