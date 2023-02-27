package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;
    protected double side;

    public abstract double getPerimeter();

    public abstract double getArea();

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(double side) {
        this.side = side;
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

    public abstract void setWidth(double width);

    /*{
        this.width = width;
    }*/

    public double getSide() {
        return side;
    }

    public abstract void setSide(double side);
    /*{
        this.side = side;
    }*/
}
