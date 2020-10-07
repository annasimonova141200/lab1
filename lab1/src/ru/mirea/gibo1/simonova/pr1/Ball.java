package ru.mirea.gibo1.simonova.pr1;
import java.lang.*;
public class Ball {
    private double radius;
    private String color;

    public Ball(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Параметры мяча:"
                + System.lineSeparator() + "Radius " + radius
                + System.lineSeparator() + "Color '" + color + '\'';
    }
}
