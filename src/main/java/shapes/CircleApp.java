package shapes;

import util.Input;

import shapes.Circle;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("Enter the radius of your circle.");
        Input input = new Input();
        double radius = input.getDouble();

        Circle myCircle = new Circle(radius);


        System.out.printf("Your radius is: %.2f.\n" +
                "Your circumference is: %.2f.\n" +
                "Your area is: %.2f.\n", myCircle.getRadius(), myCircle.getCircumference(), myCircle.getArea());



    }


}
