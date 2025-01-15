package Excercise10;

public class Book extends Item {
    private int numPages;

    Book(String code, String title, String author, int numPages) {
        super(code, title, author);
        this.numPages = numPages;
    }

    @Override
    public void show() {
        System.out.format("Number of Pages: %d", this.numPages);
    }

    public String fullCode() {
        return String.format("Code: %s, Title: %s, Number of Pages: %d", this.code, this.title, this.numPages);
    }
}
