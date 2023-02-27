package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;

    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

/*    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        System.out.println("rect");
        return length * width;
    }

    public double getPerimeter() {
        System.out.println("rect");
        return (2 * length) + (2 * width);
    }





    //accessors
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }*/
}
