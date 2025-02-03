package Excercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creando varias peliculas...
        Movie thor = new Movie("Thor", 112, 2007);
        Movie spiderman = new Movie("Spiderman", 150, 2006);
        Movie terminator = new Movie("Terminator", 120, 2002);
        Movie superman = new Movie("Superman", 120, 2004);
        Movie avengers = new Movie("Avengers", 146, 2004);

        // Creando cinema
        Cinema cinema = new Cinema("Super Cinema", 10);
        ArrayList<Movie> shortherMoviesThan120;
        ArrayList<Integer> freeRooms;

        System.out.println("------------- Agregando pelicula al Cinema (Terminator) --------------");
        System.out.println("Cinema ---> Terminator");
        cinema.addMovie(terminator, 1);
        System.out.println("------------- Agregando pelicula al Cinema (Superman) --------------");
        System.out.println("Cinema ---> Superman");
        cinema.addMovie(superman, 9);
        System.out.println("------------- Agregando pelicula al Cinema (Spiderman) --------------");
        System.out.println("Cinema ---> Spiderman");
        cinema.addMovie(spiderman);
        System.out.println("------------- Agregando pelicula al Cinema (Thor) --------------");
        System.out.println("Cinema ---> Thor");
        cinema.addMovie(thor, 8);
        System.out.println("------------- Agregando pelicula al Cinema (Avengers) --------------");
        System.out.println("Cinema ---> Avengers");
        cinema.addMovie(avengers);

        System.out.println("------------- Peliculas y Salas disponibles: --------------");
        cinema.display();

        System.out.println("------------- Actualizando una Pelicula de Sala (Avengers) --------------");
        cinema.changeRoom(avengers);

        System.out.println("------------- Peliculas y Salas disponibles: --------------");
        cinema.display();

        System.out.println("------------- Obteniendo Peliculas con duracion menor a 120 --------------");
        shortherMoviesThan120 = cinema.moviesShorterThan(120);
        System.out.println(shortherMoviesThan120);

        System.out.println("------------- Obteniendo Salas libres --------------");
        freeRooms = cinema.freeRooms();
        System.out.println(freeRooms);

        System.out.println("------------- Eliminando peliculas que comiencen por `th` --------------");
        cinema.removeMovie("th");

        System.out.println("------------- Peliculas y Salas disponibles: --------------");
        cinema.display();
    }
}
