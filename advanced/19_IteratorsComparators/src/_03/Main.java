package _03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Book bookThree = new Book("The Documents in the Case", 2002);

//        if (bookThree.compareTo(bookTwo) > 0) {
//            System.out.println(String.format("%s is before %s", bookThree, bookTwo));
//        } else if (bookThree.compareTo(bookTwo) < 0) {
//            System.out.println(String.format("%s is before %s", bookTwo, bookThree));
//        } else {
//            System.out.println("Book are equal");
//        }

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        BookComparator comparator = new BookComparator();

        books.stream()
            .sorted()
            .forEach(b -> System.out.println(b));

        // a > b && b > c => a > c

        // 5, 9, -3 => -3, 5, 9

        // compare(5, 9) => <0
        // compare(5, -3) => >0
        // compare(5, 5) => 0

        // compare(5, 9) => -4 compare(9, 5) => 4

    }
}
