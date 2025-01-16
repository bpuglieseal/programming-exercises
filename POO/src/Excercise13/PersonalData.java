package Excercise13;

public class PersonalData {
    private String bird;
    private String owner;

    PersonalData(String bird, String owner) {
        this.bird = bird;
        this.owner = owner;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBird() {
        return bird;
    }

    public String getOwner() {
        return owner;
    }
}
