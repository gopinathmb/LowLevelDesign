/**
 * Created by gopinath_mb on Jan 15, 2022
 */
package com.lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gopinath_mb
 */
public class MainClass {

  public static void main(String[] args) {
   
    List<Floor> floors = new ArrayList<>();
    floors.add(new Floor(1, 3));
    floors.add(new Floor(2, 2));
    ParkigLot pl = new ParkigLot(1, "Bangalore", floors);

    System.out.println(pl.entry("1"));
    Ticket entry2 = pl.entry("2");
    System.out.println(entry2);
    Ticket entry3 = pl.entry("3");
    System.out.println(entry3);
    System.out.println(pl.entry("4"));
    System.out.println(pl.entry("5"));
//   System.out.println( pl.entry("ABC"));
    pl.exit(entry3);
    pl.exit(entry2);
    System.out.println(pl.entry("6"));
    System.out.println(pl.entry("7"));
  }
}
