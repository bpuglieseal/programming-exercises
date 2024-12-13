package Excercise7;

public class Straight {
    int width;
    Point p1;
    Point p2;

    Straight(int width, int px1, int py1, int px2, int py2) {
        this.width = width;
        this.p1 = new Point(px1, py1);
        this.p2 = new Point(px2, py2);
    }

    Straight(int width, Point p1, Point p2) {
        this.width = width;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void show() {
        System.out.format("Width: %d\n", this.width);
        this.p1.show();
        this.p2.show();
    }

    public boolean isHorizontal () {
        return this.p1.getX() - this.p2.getX() == 0;
    }

    public boolean isVertical () {
        return this.p2.getY() - this.p1.getY() == 0;
    }

    public double lenght() {
        return Math.sqrt(Math.pow((this.p1.getX() - this.p2.getX()), 2) + Math.pow(this.p1.getY() - this.p2.getY(), 2));
    }

    public Straight longest (Straight st) {
        return this.lenght() > st.lenght() ? this : st;
    }
}
