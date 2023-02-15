package shapes;

public class Circle {
    private static int circleCounter = 0;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Circle(double radius) {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }



    //accessors
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public static int getCircleCounter() {
        return circleCounter;
    }

    public static void setCircleCounter(int circleCounter) {
        Circle.circleCounter = circleCounter;
    }
}
