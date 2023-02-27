package shapes;

public class Square extends Quadrilateral  {

    protected double side;


    public Square(double side) {
        super(side, side);
        this.side = side;
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
    public double getArea() {
        System.out.println("square");
        return side * side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("square");
        return 4 * side;
    }




/*    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    @Override
    public double getArea() {
        System.out.println("square");
        return side * side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("square");
        return 4 * side;
    }



    //accessors

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }*/
}
