/**
 * Created by gopinath_mb on Jan 29, 2022
 */
package com.concept.library;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gopinath_mb
 */
public class Floor {

  int id;
  String name;
  List<Rack> racks = new ArrayList<>();
  
  public Floor(String name)
  {
    this.name=name;
  }

  void addRacks(Rack rack) {
    racks.add(rack);
  }

  Rack addBook(Book book) {
    for(Rack rack : racks) {
      if (rack.isFree()) {
        rack.addBook(book);
        return rack;
      }
    }
    return null;
  }

  Rack search(String title) {
    for(Rack rack : racks) {
      if (rack.booksTitles.contains(title)) {
        return rack;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "Floor [ name=" + name +"]";
  }
  
  

}
