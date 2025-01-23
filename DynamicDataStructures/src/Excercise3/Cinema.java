package Excercise3;

import java.util.ArrayList;
import java.util.Arrays;

public class Cinema {
    private String name;
    private ArrayList<Movie> movies;
    private Object[] rooms;
    private int filled;

    Cinema(String name, int rooms) {
        this.name = name;
        this.rooms = new Object[rooms];
        this.filled = 0;

        Arrays.fill(this.rooms, "?????");
    }

    public int roomOfMovie (String name, int duration, int year) {
        final Movie movie = new Movie(name, duration, year);
        if (this.movies.contains(movie)) {
            for (Object roomMovie : this.rooms) {

            }
        }
    }

    public void printRooms () {
        for (Object i : this.rooms) {
            if (i instanceof String) {
                System.out.println(i);
            } else if (i instanceof Movie) {
                System.out.println(i.toString());
            }
        }
    }
}
