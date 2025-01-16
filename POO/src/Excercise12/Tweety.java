package Excercise12;

public class Tweety extends Canary {
    private int numberOfMovies;

    Tweety(Sex sex, int age, float size, int numberOfMovies) {
        super(sex, age, size);
        this.numberOfMovies = numberOfMovies;
    }
}
