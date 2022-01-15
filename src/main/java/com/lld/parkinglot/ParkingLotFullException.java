/**
 * Created by gopinath_mb on Jan 15, 2022
 */
package com.lld.parkinglot;

/**
 * @author gopinath_mb
 */
public class ParkingLotFullException extends RuntimeException {

  ParkingLotFullException(String msg) {
    super(msg);
  }
}
