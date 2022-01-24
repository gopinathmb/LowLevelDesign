/**
 * Created by gopinath_mb on Jan 24, 2022
 */
package com.concept.collection;

/**
 * @author gopinath_mb
 */
public class CustomHashMapTest {

  public static void main(String[] args) {
    CustomHashMap<Integer, Integer> customHashMap = new CustomHashMap<Integer, Integer>();
    customHashMap.put(21, 12);
    customHashMap.put(25, 121);
    customHashMap.put(30, 151);
    customHashMap.put(33, 15);
    customHashMap.put(35, 89);

    System.out.println("value corresponding to key 21=" + customHashMap.get(21));
    System.out.println("value corresponding to key 51=" + customHashMap.get(51));

    System.out.print("Displaying : ");
    customHashMap.display();

    System.out.println("\n\nvalue corresponding to key 21 removed: " + customHashMap.remove(21));
    System.out.println("value corresponding to key 51 removed: " + customHashMap.remove(51));

    System.out.print("Displaying : ");
    customHashMap.display();

  }
}
