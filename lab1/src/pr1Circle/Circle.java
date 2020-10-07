package pr1Circle;
//имя
public class Circle {
    private double radius;
    private String color;

    //конструкторы
    public Circle () {
        radius = 1.0;
        color = "red";
    }
    public Circle (double r) {
        radius = r;
        color = "red";
    }
    public Circle (double r, String c) {
        radius = r;
        color = c;
    }

//методы
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}