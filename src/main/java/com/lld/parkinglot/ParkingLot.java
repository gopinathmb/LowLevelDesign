/**
 * Created by gopinath_mb on Jan 20, 2022
 */
package com.lld.parkinglot;

import java.util.List;

import com.lld.parkinglot.gate.Entrance;
import com.lld.parkinglot.gate.Exit;
import com.lld.parkinglot.role.ParkingAttendant;
import com.lld.parkinglot.vehicle.Vehicle;

/**
 * @author gopinath_mb
 */
public class ParkingLot {
  List<ParkingFloor> parkingFloors;
  List<Entrance> entrances;
  List<Exit> exits;

  Address address; 

  String parkingLotName;

  public boolean isParkingSpaceAvailableForVehicle(Vehicle vehicle)
  {
    return false;
  }
  public boolean updateParkingAttndant(ParkingAttendant parkingAttendant, int gateId)
  {
    return false;
  }
}
