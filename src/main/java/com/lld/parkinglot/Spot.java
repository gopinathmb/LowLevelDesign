/**
 * Created by gopinath_mb on Jan 15, 2022
 */
package com.lld.parkinglot;

/**
 * @author gopinath_mb
 */
public class Spot {

  int floorNo;
  int pos;

  public Spot(int floorNo, int pos) {
    super();
    this.floorNo = floorNo;
    this.pos = pos;
  }

  @Override
  public String toString() {
    return "Spot [floorNo=" + floorNo + ", pos=" + pos + "]";
  }

}
