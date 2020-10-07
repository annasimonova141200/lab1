package pr1Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("Радиус " + c1.getRadius()
                + " цвет " + c1.getColor()
                + " область " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Радиус " + c2.getRadius()
                + " цвет " + c2.getColor()
                + " область " + c2.getArea());

        Circle c3 = new Circle();
        System.out.println("Радиус " + c3.getRadius()
                + " цвет " + c3.getColor()
                + " область " + c3.getArea());
    }
}

