package Excercise3;

import java.util.Calendar;
import java.util.Date;

public class Movie {
    private String name;
    private int duration;
    private int year;

    Movie(String name, int duration, int year) {
        this.name = name;
        this.duration = duration;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Duration: %d, Year: %d", this.name, this.duration, this.year);
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Movie movie)) return false;
        return movie.getName().equalsIgnoreCase(this.name) && (Math.abs(movie.getDuration() - this.duration) >= 0) && Math.abs(movie.getDuration() - this.duration) <= 5;
    }
}
