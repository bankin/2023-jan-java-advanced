package _02;

import java.util.Iterator;

public class _02_Main {

    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Book bookThree = new Book("The Documents in the Case", 2002);

        Library lib = new Library(bookOne, bookTwo, bookThree);

        for (Book book : lib) {
            // for-body

            System.out.println(book.getTitle());
        }

        lib.forEach(book -> System.out.println(book.getTitle()));

        Iterator<Book> iterator = lib.iterator();
        while (iterator.hasNext()) {
            Book current = iterator.next(); // 0, 1, 2

            // for-body

            System.out.println(current.getTitle());
        }
    }
}
