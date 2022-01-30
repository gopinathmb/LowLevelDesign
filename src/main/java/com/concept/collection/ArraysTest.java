package com.concept.collection;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gopinath_mb on Jan 20, 2022
 */

/**
 * @author gopinath_mb
 */
public class ArraysTest {

  public static void main(String[] args) {
    List<Integer> asList = Arrays.asList(1, 2, 3, 4);
    System.out.println(asList);
    int[] arr = new int[2];
    List<int[]> asList2 = Arrays.asList(arr);
    System.out.println(asList2);
//    asList2.add(new int[] { 1 });
    
    Arrays.sort( new Integer[] {1, 2, 3, 4},(a,b)->a-b);
    System.out.println(-10%10);
    System.out.println(13%10);
  }
}
