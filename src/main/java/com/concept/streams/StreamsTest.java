/**
 * Created by gopinath_mb on Jan 7, 2022
 */
package com.concept.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/**
 * @author gopinath_mb
 */
public class StreamsTest {

  public static void main(String[] args) {
    List<Integer> numList = new ArrayList<>();
    numList.add(10);
    numList.add(3);
    numList.add(21);
    numList.add(1);
    numList.add(7);
    numList.add(4);
    numList.add(17);

    ;

    System.out.println(numList);
    List<Integer> newList = numList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    System.out.println("Even numbers Filtered:" + newList);
    System.out.println("\n########################");

    System.out.println(numList);
    long count = numList.stream().filter(i -> i % 2 == 1).count();
    System.out.println("Odd numbers Filtered and count is :" + count);
    System.out.println("\n########################");

    System.out.println(numList);
    System.out.print("Odd numbers Filtered and printed using foreach :");
    numList.stream().filter(i -> i % 2 == 1).forEach(i -> System.out.print(" " + i));
    System.out.println("\n\n########################");

    System.out.println(numList);
    newList = numList.stream().sorted().collect(Collectors.toList());
    System.out.println("All numbers are sorted in natural order and collected :" + newList);
    System.out.println("\n########################");

    System.out.println(numList);
    newList = numList.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
    System.out.println("All numbers are sorted in decending order and collected :" + newList);
    System.out.println("\n########################");

    System.out.println(numList);
    int min = numList.stream().min((a, b) -> a - b).get();
    System.out.println("Min of the list is  :" + min);
    System.out.println("\n########################");

    System.out.println(numList);
    int max = numList.stream().max((a, b) -> a - b).get();
    System.out.println("Maximum of the list is  :" + max);
    System.out.println("\n########################");

    System.out.println(numList);
    newList = numList.stream().map(i -> i * 2).collect(Collectors.toList());
    System.out.println("Iterated and doubled every element of list thorugh map :" + newList);
    System.out.println("\n########################");

  }
}
