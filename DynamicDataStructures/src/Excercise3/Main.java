package Excercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie thor = new Movie("Thor", 112, 2007);
        Movie spiderman = new Movie("Spiderman", 150, 2006);
        Movie terminator = new Movie("Terminator", 120, 2002);
        Movie superman = new Movie("Superman", 120, 2004);
        Cinema cinema = new Cinema("Super Cinema", 10);
        Movie avengers = new Movie("Avengers", 146, 2004);
        ArrayList<Movie> shortherMoviesThan120;

        cinema.addMovie(terminator, 1);
        cinema.addMovie(superman, 2);
        cinema.addMovie(spiderman, 3);
        cinema.addMovie(thor);
        cinema.addMovie(avengers);

        cinema.display();
        cinema.changeRoom(avengers);
        cinema.display();
    }
}
