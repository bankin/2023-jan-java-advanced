package demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Main {

    public static void main(String[] args) {
        Document doc = new Document();
        Printable printable = new Document();
        Serializable serializable = new Document();

        doc.print();
        doc.status();

        printable.print();

//        serializable.print(); // error

        List<Integer> list = new ArrayList<>();
        Iterable<Integer> collection = new ArrayList<>();

//        collection.add() // error

        Serializable sList = new ArrayList<Integer>();
    }
}
