package Excercise13;

public class Tweety extends Canary {
    private int numberOfMovies;

    Tweety(Sex sex, int age, String bird, String owner, float size, int numberOfMovies) {
        super(sex, age, bird, owner, size);
        this.numberOfMovies = numberOfMovies;
    }
}
