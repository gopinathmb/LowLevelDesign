/**
 * Created by gopinath_mb on Jan 20, 2022
 */
package com.lld.parkinglot.test;

import com.lld.parkinglot.ParkingFloor;
import com.lld.parkinglot.ParkingLot;
import com.lld.parkinglot.role.Admin;

/**
 * @author gopinath_mb
 */
public class ParkingLotTest {

  public static void main(String[] args) {
    
    ParkingLot parkingLot=new ParkingLot();
    Admin admin=new Admin();
    admin.addParkingFloor(parkingLot, new ParkingFloor());
    admin.addParkingFloor(parkingLot, new ParkingFloor());
    
    
    
  }
}
