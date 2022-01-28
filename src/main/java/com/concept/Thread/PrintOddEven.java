/**
 * Created by gopinath_mb on Jan 26, 2022
 */
package com.concept.Thread;

/**
 * @author gopinath_mb
 */
public class PrintOddEven {

  public static void main(String[] args) throws InterruptedException {

    Lock lock = new Lock();
    Thread odd = new Thread(new PrintThread(lock, true));
    Thread even = new Thread(new PrintThread(lock, false));
    odd.start();
    Thread.sleep(10000);
    even.start();

  }
}

class Lock {

  boolean isWait = true;
}

class PrintThread implements Runnable {

  Lock lock;
  int i = 0;
  boolean isOdd;

  public PrintThread(Lock lock, boolean isOdd) {
    this.lock = lock;
    this.isOdd = isOdd;
    if (isOdd)
      i = 1;
  }

  public void run() {
    while (i < 10) {
      synchronized (lock) {
        if (isOdd) {
          i = printOdd(i);
        } else {
          i = printEven(i);
        }
      }
    }
  }

  /**
   * @param i
   * @return
   */
  private int printOdd(int i) {
    if (lock.isWait) {
      try {
        lock.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    lock.isWait = true;
    System.out.println("OddThread :" + i);
    i = i + 2;
    lock.notifyAll();
    return i;
  }

  private int printEven(int i) {
    System.out.println("evenThread :" + i);
    i = i + 2;
    lock.isWait = false;
    lock.notifyAll();
    try {
      lock.wait();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return i;
  }

}
