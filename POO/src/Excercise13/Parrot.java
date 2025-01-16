package Excercise13;

public class Parrot extends Bird {
    private Region region;
    private String colour;

    Parrot(Sex sex, int age, Region region, String bird, String owner, String colour) {
        super(sex, age, bird, owner);
        this.region = region;
        this.colour = colour;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void whereAreYouFrom () {
        switch (this.region) {
            case EAST -> { System.out.println("East"); }
            case NORTH -> { System.out.println("North"); }
            case SOUTH -> { System.out.println("South"); }
            case WEST -> { System.out.println("West"); }
        }
    }
}
