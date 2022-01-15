/**
 * Created by gopinath_mb on Jan 15, 2022
 */
package com.lld.parkinglot;

/**
 * @author gopinath_mb
 */
public class Ticket {

  String id;
  String vehicleNo;
  long startTime;
  Spot spot;

  public Ticket(String id, String vehicleNo, long startTime, Spot spot) {
    super();
    this.id = id;
    this.vehicleNo = vehicleNo;
    this.startTime = startTime;
    this.spot = spot;
  }

  @Override
  public String toString() {
    return "Ticket [id=" + id + ", vehicleNo=" + vehicleNo + ", startTime=" + startTime + ", spot="
        + spot + "]";
  }

}
