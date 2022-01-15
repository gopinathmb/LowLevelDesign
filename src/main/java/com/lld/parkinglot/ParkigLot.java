/**
 * Created by gopinath_mb on Jan 15, 2022
 */
package com.lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gopinath_mb
 */
public class ParkigLot {

  int id;
  String address;
  List<Floor> floors = new ArrayList<>();
  
  public ParkigLot(int id, String address, Floor floor) {
    super();
    this.id = id;
    this.address = address;
    floors.add(floor);
  }

  public ParkigLot(int id, String address, List<Floor> floors) {
    super();
    this.id = id;
    this.address = address;
    this.floors = floors;
  }

  Ticket entry(String vehicleNo) throws ParkingLotFullException {
    for(Floor floor : floors) {
      int freeSlot = floor.getFreeSlot();
      if (freeSlot != -1) {
        Ticket ticket = new Ticket("123", vehicleNo, System.currentTimeMillis(),
            new Spot(floor.floorId, freeSlot));
        return ticket;
      }
    }
    throw new ParkingLotFullException("Parking lot is Full");

  }
  
  void exit(Ticket t)
  {
    //validations
    Spot spot = t.spot;
    floors.get(spot.floorNo-1).freeOneSlot(spot.pos);
    //payment
  }
  

}
