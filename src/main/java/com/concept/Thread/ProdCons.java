/**
 * Created by gopinath_mb on Jan 26, 2022
 */
package com.concept.Thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gopinath_mb
 */
public class ProdCons {

  public static void main(String[] args) {

    Object lock = new Object();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    new Thread(new Prod(lock, linkedList)).start();
    new Thread(new Cons(lock, linkedList)).start();
  }
}

class Prod implements Runnable {

  Object lock;
  Queue<Integer> queue;

  public Prod(Object lock, Queue<Integer> queue) {
    this.lock = lock;
    this.queue = queue;

  }

  public void run() {
    int i = 0;
    while (i < 100) {
//      try {
//        Thread.sleep(100);
//      } catch (InterruptedException e1) {
//        // TODO Auto-generated catch block
//        e1.printStackTrace();
//      }
      synchronized (lock) {

//        if (queue.size() > 2) {
//          System.out.println("Queue is Full");
//          lock.notifyAll();
//          try {
//            lock.wait();
//          } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//          }
//        }
        System.out.println("Produced: " + i);
        queue.add(i);
        i++;
        lock.notifyAll();
      }
    }
  }
}

class Cons implements Runnable {

  Object lock;
  Queue<Integer> queue;

  public Cons(Object lock, Queue<Integer> queue) {
    this.lock = lock;
    this.queue = queue;

  }

  public void run() {
    int i = 0;
    while (i < 100) {

      synchronized (lock) {

        if (queue.isEmpty()) {
          System.out.println("Queue is Empty");
          try {
            lock.wait();
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        System.out.println("Consumed: " + queue.poll());
        i++;
      }
    }
  }
}
