/**
 * Created by gopinath_mb on Jan 15, 2022
 */
package com.lld.parkinglot;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author gopinath_mb
 */
public class Floor {

  int floorId;
  int cap;
  //EL, HAND, TRUCKs
  Queue<Integer> freeSlots = new PriorityQueue<>();

  public Floor(int floorId, int cap) {
    this.floorId = floorId;
    this.cap = cap;
    for(int i = 1; i <= cap; i++) {
      freeSlots.add(i);
    }
  }

  boolean isFull() {
    return freeSlots.isEmpty();
  }

  int getFreeSlot() {
    if (isFull()) {
      return -1;
    }
    return freeSlots.poll();

  }

  /**
   * @param pos
   */
  public void freeOneSlot(int pos) {
    freeSlots.add(pos);

  }

}
