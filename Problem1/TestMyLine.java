package Problem1;

public class TestMyLine {
    public static void main(String[] args) {
        // Test MyLine with coordinates
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.println("Line 1: " + line1);
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Gradient of Line 1: " + line1.getGradient());

        // Test MyLine with MyPoint objects
        MyPoint point1 = new MyPoint(2, 3);
        MyPoint point2 = new MyPoint(5, 9);
        MyLine line2 = new MyLine(point1, point2);
        System.out.println("Line 2: " + line2);
        System.out.println("Length of Line 2: " + line2.getLength());
        System.out.println("Gradient of Line 2: " + line2.getGradient());

        // Modify the begin and end points
        line2.setBeginXY(1, 1);
        line2.setEndXY(4, 5);
        System.out.println("Modified Line 2: " + line2);
        System.out.println("Length of Modified Line 2: " + line2.getLength());
        System.out.println("Gradient of Modified Line 2: " + line2.getGradient());
    }
}
