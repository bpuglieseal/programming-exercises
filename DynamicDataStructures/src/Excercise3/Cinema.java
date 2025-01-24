package Excercise3;

import java.lang.management.MonitorInfo;
import java.util.ArrayList;
import java.util.Arrays;

public class Cinema {
    private String name;
    private ArrayList<Movie> movies;
    private Object[] rooms;
    private int fill;
    private int limit;
    private int current;

    Cinema(String name, int rooms) {
        this.name = name;
        this.movies = new ArrayList<Movie>();
        this.rooms = new Object[rooms];
        this.fill = 0;
        this.current = 0;
        this.limit = rooms;

        Arrays.fill(this.rooms, "?????");
    }

    public int roomOfMovie (String name, int duration, int year) {
        final Movie movie = new Movie(name, duration, year);
        int index = this.movies.indexOf(movie);

        if (index != -1) {
            for (int i = 0; i < this.limit; i++) {
                if (this.rooms[i] instanceof Integer && (Integer) this.rooms[i] == index) {
                    return i;
                }
            }
        }

        return -1;
    }

    public void addMovie(Movie movie, int roomIndex) {
        if (this.movies.contains(movie)) {
            return;
        }

        if (this.rooms[roomIndex - 1] instanceof Integer) {
            return;
        }

        if (fill == limit) {
            return;
        }

        this.movies.add(movie);
        int index = this.movies.indexOf(movie);
        this.rooms[roomIndex - 1] = index;
        this.fill++;
    }

    public void addMovie(Movie movie) {
        if (this.movies.contains(movie)) {
            return;
        }

        if (fill == limit) {
            return;
        }

        this.movies.add(movie);
        int index = this.movies.indexOf(movie);

        while (this.rooms[current] instanceof Integer) {
            if (this.current == limit) this.current = 0;
            else this.current++;
        };

        this.rooms[current] = index;
        this.fill++;
        this.current++;
    }

    public void removeMovie(String movieName) {

    }

    public void display () {
        for (int i = 0; i < this.limit; i++) {
            if (this.rooms[i] instanceof String) {
                System.out.println(this.rooms[i]);
            } else if (this.rooms[i] instanceof Integer) {
                final Movie movie = this.movies.get((Integer) this.rooms[i]);
                System.out.format("%s - Room %d\n", movie.getName(), i + 1);
            }
        }
    }
}
