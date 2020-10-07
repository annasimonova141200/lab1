package ru.mirea.gibo1.simonova.pr1;
import java.lang.*;
public class Book {
    private String name;
    private int pages;

    public Book(String n, int p) {
        name = n;
        pages = p;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "В книге "
                + name
                + " количество страниц равно " + pages
                +".";
    }
}
