/**
 * Created by gopinath_mb on Jan 29, 2022
 */
package com.concept.library;

import java.util.Objects;

/**
 * @author gopinath_mb
 */
public class Book {

  int id;
  String title;
  Author author;
  Genre genre;
  
  Book(String title,Author author)
  {
    this.title=title;
    this.author=author;
  }
  @Override
  public int hashCode() {
    return Objects.hash(author, genre, id, title);
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return Objects.equals(author, other.author) && genre == other.genre && id == other.id
        && Objects.equals(title, other.title);
  }
  @Override
  public String toString() {
    return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + "]";
  }
  
  
}
