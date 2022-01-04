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

    Thread producer = new Thread(new Producer(q, lock));
    producer.start();

    Thread consumer = new Thread(new Consumer(q, lock));
    consumer.start();
  }

}

class Producer implements Runnable {

  Queue<Integer> q;
  Object lock;

  Producer(Queue<Integer> q, Object lock) {
    this.q = q;
    this.lock = lock;
  }

  public void run() {
    System.out.println("Insider Producer..");
    int i = 1;
    while (true) {
      synchronized (lock) {
        while (q.size() > 10) {
          lock.notify();
          try {
            lock.wait();
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        q.add(i);
        System.out.println("Producer produced " + i++);
        lock.notify();
      }
    }

  }
}

class Consumer implements Runnable {

  Queue<Integer> q;
  Object lock;

  Consumer(Queue<Integer> q, Object lock) {
    this.q = q;
    this.lock = lock;
  }

  public void run() {
    System.out.println("Insider Consumer..");
    while (true) {
      synchronized (lock) {
        while (q.isEmpty()) {
          lock.notify();
          try {
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        Integer poll = q.poll();
        System.out.println("consumer consumed" + poll);
        lock.notify();
        if(poll==20)
        {
          break;
        }
      }
    }
  }
}
