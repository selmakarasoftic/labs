package src.main.java.org.example.week6.Library;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> library;
    public Library(){
            library = new ArrayList<>();
    }
    public void addBook(Book book){
        library.add(book);
    }
    public void printBooks(){
        for(Book b : library){
            System.out.println(b.toString());
        }
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : library){
            if (book.publisher().equals(publisher))
                found.add(book);
        }
        return found;
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : library) {
           // if (book.title().toUpperCase().contains(title.toUpperCase())) {
             //   found.add(book);
             if(StringUtils.included(book.title(), title)) {
                  found.add(book);
            }

        }

        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : library) {
            if (book.year()==(year))
                found.add(book);
        }
        return found;
    }
}
