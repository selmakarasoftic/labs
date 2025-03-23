package src.main.java.org.example.week6.Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book cheese1 = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese1.title());
        System.out.println(cheese1.publisher());
        System.out.println(cheese1.year());
        System.out.println(cheese1);

        Library Library = new Library();
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        Library.addBook(cheese);
        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        Library.addBook(new Book("The Stinky cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.printBooks();

        System.out.println();
        System.out.println("---");
        System.out.println("Title search");
        ArrayList<Book> result = Library.searchByTitle("Cheese");

        for (Book book: result) {
            System.out.println(book);
        }


        System.out.println("---");
        System.out.println("Publisher search");
        for (Book book: Library.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }


        System.out.println("---");
        System.out.println("Year Search");
        for (Book book: Library.searchByYear(1851)) {
            System.out.println(book);
        }

    }
}
