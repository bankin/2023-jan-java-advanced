package demo;

import java.util.List;

public class BookSeries extends Book {
    private List<Book> books;

    private double bundlePrice;

    public BookSeries(String title, int year, String... authors) {
        super(title, year, authors);
    }
}
