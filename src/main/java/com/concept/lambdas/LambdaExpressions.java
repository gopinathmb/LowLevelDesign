/**
 * Created by gopinath_mb on Jan 8, 2022
 */
package com.concept.lambdas;

import java.util.Comparator;
import java.util.concurrent.Callable;

/**
 * @author gopinath_mb
 */
public class LambdaExpressions {

  public static void main(String[] args) {

    Runnable r = () -> System.out
        .println("This is Called from : " + Thread.currentThread().getName());
    Thread t = new Thread(r, "My New Thread");
    t.start();
    System.out.println("Ended my main with thread: " + Thread.currentThread().getName());

    // Single line so no need of {}
    Comparator<Integer> intComparator = (a, b) -> a - b;

    Comparator<String> stringComparator = (a, b) -> a.compareTo(b);
    // No need to mention return if only one statement
    Callable<String> callable = () -> "ab";
    // Multiple lines of code an dhence {} is required.
    Callable<String> anotherComplex = () -> {
      System.out.println("This is called from : " + Thread.currentThread());
      return "abcd";
    };

    FunctionalIntf f = (s) -> s.length();

    FunctionalIntf f2 = s -> s.length();

  }

}

interface FunctionalIntf {

  public int getLength(String s);
}
