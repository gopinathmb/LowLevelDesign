/**
 * Created by gopinath_mb on Jan 29, 2022
 */
package com.concept.library;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gopinath_mb
 */
public class Rack {

  String name;
  Set<String> booksTitles = new HashSet<>();
  Set<Book> books = new HashSet<>();
  int freeSlots = 2;

  public Rack(String name) {
    this.name = name;
  }

  boolean isFree() {
    return freeSlots > 0;
  }

  void addBook(Book book) {
    books.add(book);
    booksTitles.add(book.title);
    freeSlots--;
  }

  void removeBook(Book book) {
    books.remove(book);
    booksTitles.remove(book.title);
    freeSlots--;

  }

  @Override
  public String toString() {
    return "Rack [name=" + name + ", booksTitles=" + booksTitles + ", freeSlots="
        + freeSlots + "]";
  }
  
  

}
