package com.lld.parkinglot.role;

import com.lld.parkinglot.ParkingDisplayBoard;
import com.lld.parkinglot.ParkingFloor;
import com.lld.parkinglot.ParkingLot;
import com.lld.parkinglot.ParkingSpace;

import cpm.lld.bms.Account;

public class Admin extends Account {

  public boolean addParkingFloor(ParkingLot parkingLot, ParkingFloor floor) {
    return false;
  }

  public boolean addParkingSpace(ParkingFloor floor, ParkingSpace parkingSpace) {
    return false;
  }

  public boolean addParkingDisplayBoard(ParkingFloor floor, ParkingDisplayBoard parkingDisplayBoard) {
    return false;
  }

}