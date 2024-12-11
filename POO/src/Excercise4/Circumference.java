package Excercise4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Circumference {
    private String colour;
    private double radius;

    Circumference(String colour, double radius) {
        this.colour = colour;
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printPerimeter() {
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("##.##", symbol);

        System.out.format("Perimeter of the circumference: %s\n", formatter.format(2 * Math.PI * this.radius));
    }

    public boolean isBig() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area > 20;
    }

    @Override
    public boolean equals(Object obj) {
        final Circumference c = (Circumference) obj;
        return this.colour.equals(c.colour) && this.radius == c.radius;
    }

    public void show () {
        System.out.format("Colour: %s\n", this.colour);
        System.out.format("Radius: %s\n", this.radius);
    }
}
