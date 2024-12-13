package Excercise7;

public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void quadrant () {
        int q = 0;
        if (x > 0 && y > 0) q = 1;
        if (x < 0 && y > 0) q = 2;
        if (x < 0 && y < 0) q = 3;
        if (x > 0 && y < 0) q = 4;

        System.out.format("El punto (%d, %d) pertenece al cuadrante %d", this.x, this.y, q);
    }

    public void show () {
        System.out.format("Punto: (%d, %d)\n", this.x, this.y);
    }
}
