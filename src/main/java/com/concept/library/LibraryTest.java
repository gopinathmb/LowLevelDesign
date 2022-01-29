/**
 * Created by gopinath_mb on Jan 29, 2022
 */
package com.concept.library;

/**
 * @author gopinath_mb
 */
public class LibraryTest {

  public static void main(String[] args) {

    Library library = new Library();
    library.name = "My Library";
    Floor floor = new Floor("Ground");
    floor.addRacks(new Rack("Rack1"));
    library.addFloor(floor);
    floor = new Floor("First");
    floor.addRacks(new Rack("Rack2"));
    floor.addRacks(new Rack("Rack3"));
    library.addFloor(floor);
    Author shivKhera = new Author("shivKhera");
    Author tolle = new Author("E Tolle");
    Author robin = new Author("Robin Sharma");

    Book book1 = new Book("You can win", shivKhera);
    Book book2 = new Book("Ferrari", robin);
    Book book3 = new Book("Do Before you Die", robin);
    Book book4 = new Book("Power of Now", tolle);
    Book book5 = new Book("New Earth", tolle);
    Book book6 = new Book("Freedom", shivKhera);
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book6);
    library.addBook(book3);
    library.addBook(book5);
    library.addBook(book4);

    
    library.search("Ferrari");
    library.search("Ferrari1")
    ;
    library.search("Freedom");
    library.search("Power of Now");
  }
}
