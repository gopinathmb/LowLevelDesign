/**
 * Created by gopinath_mb on Jan 3, 2022
 */
package com.concept.Thread;

import java.util.concurrent.Callable;

/**
 * @author gopinath_mb
 */
public class ThreadTest {

  public static void main(String[] args) {

    Thread t = new Thread(new MyRunnable());
    System.out.println("Before starting new thread.." + Thread.currentThread().getName());
    t.start();
    System.out.println("after starting new thread.." + Thread.currentThread().getName());

  }
}

class MyRunnable implements Runnable {

  public void run() {
    System.out.println("Inside MyRunnable and excuted by " + Thread.currentThread().getName());
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {

      throw new RuntimeException(e);
    }
  }

  class MyCallable implements Callable<String> {

    public String call() {
      System.out.println("Inside MyCallable and excuted by " + Thread.currentThread().getName());
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {

        throw new RuntimeException(e);
      }
      return "Success";
    }
  }
}