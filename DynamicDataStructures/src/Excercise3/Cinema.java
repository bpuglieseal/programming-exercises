package Excercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

        if (this.fill == this.limit) {
            return;
        }

        this.movies.add(movie);
        int index = this.movies.indexOf(movie);
        this.rooms[roomIndex - 1] = index;
        this.fill++;
    }

    public void addMovie(Movie movie) {
        if (!(this.movies.contains(movie)) && !(this.fill == this.limit)) {
            this.movies.add(movie);
            int index = this.movies.indexOf(movie);

            while (this.rooms[this.current] instanceof Integer) {
                if (this.current == this.limit) this.current = 0;
                else this.current++;
            };

            this.rooms[this.current] = index;
            this.fill++;
            this.current++;
        }
    }

    public void removeMovie(String movieName) {
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().toLowerCase().startsWith(movieName.toLowerCase())) {
                this.movies.remove(i);
                for (int j = 0; j < this.limit; j++) {
                    if (this.rooms[j] instanceof Integer && ((Integer) this.rooms[j]).compareTo(i) == 0) {
                        this.rooms[j] = "?????";
                    } else if (this.rooms[j] instanceof Integer && ((Integer) this.rooms[j]).compareTo(i) > 0) {
                        this.rooms[j] = (Integer) this.rooms[j] - 1;
                    }
                }
            }
        }
    }

    public ArrayList<Movie> moviesShorterThan (int minutes) {
        ArrayList<Movie> shortherMovies = new ArrayList<Movie>();
        for (Movie movie : this.movies) {
            if (movie.getDuration() < minutes) {
                shortherMovies.add(movie);
            }
        }
        return shortherMovies;
    }

    public ArrayList<Integer> freeRooms () {
        ArrayList<Integer> freeRooms = new ArrayList<Integer>();
        for (int i = 0; i < this.limit; i++) {
            if (this.rooms[i] instanceof String) {
                freeRooms.add(i);
            }
        }
        return freeRooms;
    }

    public void display () {
        for (int i = 0; i < this.limit; i++) {
            if (this.rooms[i] instanceof Integer) {
                final Movie movie = this.movies.get((Integer) this.rooms[i]);
                System.out.format("%s - Room %d\n", movie.getName(), i + 1);
            }
        }
    }

    public void resetCinema() {
        this.movies.clear();
        this.rooms = new Object[this.rooms.length];

        Arrays.fill(this.rooms, "?????");
    }

    public void changeRoom (Movie movie) {
        if (!this.movies.contains(movie)) {
            System.out.println("La pelicula no fue encontrada.");
        }

        Scanner sc = new Scanner(System.in);
        int newRoom = -1;
        int movieIndex = this.movies.indexOf(movie);
        int roomIndex = -1;
        boolean isValid = false;

        for (int i = 0; i < this.limit && roomIndex == -1; i++) {
            if (this.rooms[i] instanceof Integer && ((Integer) this.rooms[i]).compareTo(movieIndex) == 0) {
                roomIndex = i;
            }
        }

        System.out.format("- Room de la pelicula: Room - %d\n", roomIndex + 1);
        System.out.println("+ Salas libres: ");

        for (int i = 0; i < this.limit; i++) {
            if (this.rooms[i] instanceof String) {
                System.out.format("- Room %d\n", i + 1);
            }
        }

        do {
            System.out.print("Escoge la nueva sala de la pelicula: ");
            newRoom = sc.nextInt();
            isValid = newRoom - 1 < this.limit && newRoom >= 0 && (this.rooms[this.limit - 1] instanceof String);
        } while (!isValid);

        this.rooms[roomIndex] = "?????";
        this.rooms[newRoom - 1] = movieIndex;
    }
}
