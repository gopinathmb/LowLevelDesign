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
    while (i < 100) {
      sleep();
      synchronized (lock) {
        while (q.size() > 25) {
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
    }

  }

  /**
   * 
   */
  private void sleep() {
    try {
      Thread.sleep(10);
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }
}

class Consumer1 implements Runnable {

  Queue<Integer> q;
  Object lock;
  int i = 0;

  Consumer1(Queue<Integer> q, Object lock) {
    this.q = q;
    this.lock = lock;
  }

  public void run() {
    System.out.println("Insider Consumer..");
    while (i < 99) {
      sleep();
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
        i++;
        lock.notifyAll();
      }
    }
  }
  private void sleep() {
    try {
      Thread.sleep(50);
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }
}
