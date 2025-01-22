package Excercise2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Points {
    private ArrayList<Point> points;

    Points() {
        this.points = new ArrayList<Point>();

        for (int i = 0; i < 20; i++) {
            int x = Helper.getRandomNumber(-10, 10);
            int y = Helper.getRandomNumber(-10, 10);

            this.points.add(new Point(x, y));
        }
    }

    Points(ArrayList<Point> points) {
        this.points = points;
    }

    public void printPoints () {
        for (Point point : this.points) {
            System.out.format("%s\n", point.toString());
        }
        System.out.println("Size: " + this.points.size());
    }

    public ArrayList<Point> reverse () {
        ArrayList<Point> reversed = new ArrayList<>(this.points);
        Collections.reverse(reversed);
        return reversed;
    }

    public Point getFirstPointInTheSecondQuadrant () {
        Iterator<Point> iterator = this.points.iterator();
        while (iterator.hasNext()) {
            Point current = iterator.next();
            int x = current.getX();
            int y = current.getY();

            if (y > 0 && x < 0) return current;
        }

        return null;
    }

    public void displayFistZeroPoint() {
        for (int i = 0; i < this.points.size(); i++) {
            Point current = this.points.get(i);
            if (current.getX() == 0 && current.getY() == 0) {
                System.out.format("The point (0, 0) is in the position %d", i);
            }
        }

        System.out.println("The ArrayList does not contain any (0,0) point");
    }

    public void displayFirstOnePoint() {
        for (int i = 0; i < this.points.size(); i++) {
            Point current = this.points.get(i);
            if (current.getX() == 0 && current.getY() == 0) {
                System.out.format("The point (1, 1) is in the position %d", i);
            }
        }

        System.out.println("The ArrayList does not contain any (1,1) point");
    }

    public void deletePointsWithSizeLessThan10() {
        for (int i = 0; i < this.points.size(); i++) {
            Point current = this.points.get(i);
            if (Math.sqrt(Math.pow(current.getX(), 2) + Math.pow(current.getY(), 2)) < 10) {
                this.points.remove(i);
            }
        }

        System.out.println("Points eliminated");
    }

    public void deletePointsInThe4ThQuadrant() {
        for (int i = 0; i < this.points.size(); i++) {
            Point current = this.points.get(i);
            if (current.getX() > 0 && current.getY() < 0) {
                this.points.remove(i);
            }
        }

        System.out.println("Points eliminated");
    }
}
