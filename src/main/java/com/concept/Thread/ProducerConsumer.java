/**
 * Created by gopinath_mb on Jan 3, 2022
 */
package com.concept.Thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gopinath_mb
 */
public class ProducerConsumer {

  public static void main(String[] args) {

    Queue<Integer> q = new LinkedList<>();
    Object lock = new Object();

    Thread producer = new Thread(new Producer1(q, lock));
    producer.start();

    Thread consumer = new Thread(new Consumer1(q, lock));
    consumer.start();
  }

}

class Producer1 implements Runnable {

  Queue<Integer> q;
  Object lock;

  Producer1(Queue<Integer> q, Object lock) {
    this.q = q;
    this.lock = lock;
  }

  public void run() {
    System.out.println("Insider Producer..");
    int i = 1;
    while (true) {
      synchronized (lock) {
        while (q.size() > 1000) {
          try {
            System.out.println("Queue is Full so waiting...");
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        q.add(i);
        
        System.out.println("Producer produced " + i++);
        lock.notifyAll();
      }
//      try {
//        Thread.sleep(1);
//      } catch (InterruptedException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//      }
    }
    

  }
}

class Consumer1 implements Runnable {

  Queue<Integer> q;
  Object lock;

  Consumer1(Queue<Integer> q, Object lock) {
    this.q = q;
    this.lock = lock;
  }

  public void run() {
    System.out.println("Insider Consumer..");
    while (true) {
      synchronized (lock) {
        while (q.isEmpty()) {
          try {
            System.out.println("Queue is empty so waiting...");
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        Integer poll = q.poll();
        System.out.println("consumer consumed" + poll);
        lock.notifyAll();
//        if (poll == 20) {
//          break;
//        }
      }
//    try {
//    Thread.sleep(5);
//  } catch (InterruptedException e) {
//    // TODO Auto-generated catch block
//    e.printStackTrace();
//  }
    }
  }
}
