package Excercise10;

public class Record extends Item {
    private String discography;

    Record(String code, String title, String author, String discography) {
        super(code, title, author);
        this.discography = discography;
    }

    @Override
    public void show() {
        System.out.format("Discography: %s", this.discography);
    }
}
