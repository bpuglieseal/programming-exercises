package Excercise10;

public class Item {
    protected String code;
    protected String title;
    protected String author;

    Item(String code, String title, String author) {
        this.code = code;
        this.title = title;
        this.author = author;
    }

    public void show () {
        System.out.format("Code: %s, Title: %s, Author: %s", this.code, this.title, this.author);
    }
}
