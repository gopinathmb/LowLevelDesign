/**
 * Created by gopinath_mb on Jan 29, 2022
 */
package com.concept.library;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gopinath_mb
 */
public class Author {

  /**
   * @param string
   */
  public Author(String name) {
    this.name=name;
  }
  void addBooks(Book book)
  {
    books.add(book);
  }
  long id;
  String name;
  String bio;
  List<Book> books=new ArrayList<>();
  @Override
  public String toString() {
    return "Author [ name=" + name +"]";
  }

  
  
}
