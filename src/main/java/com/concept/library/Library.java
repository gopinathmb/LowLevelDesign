/**
 * Created by gopinath_mb on Jan 29, 2022
 */
package com.concept.library;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gopinath_mb
 */
public class Library {

  long id;
  String name;
  Address address;
  List<Floor> floors = new ArrayList<>();

  void addFloor(Floor floor) {
    floors.add(floor);
  }

  Position addBook(Book book) {

    for(Floor floor : floors) {
      Rack rack = floor.addBook(book);
      if (rack != null) {
        Position position = new Position();
        position.rackId = rack;
        position.floorId = floor;
        System.out.println("Added :"+book +" at :"+position);
        return position;
      }
    }

    return null;
  }
  
  Position search(String title) {

    for(Floor floor : floors) {
      Rack rack = floor.search(title);
      if (rack != null) {
        Position position = new Position();
        position.rackId = rack;
        position.floorId = floor;
        System.out.println("Found :"+title +" at :"+position);
        return position;
      }
    }
    System.out.println("Didn't Found : "+title );
    return null;
  }
}
