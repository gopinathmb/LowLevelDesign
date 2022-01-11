/**
 * Created by gopinath_mb on Jan 7, 2022
 */
package com.concept.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

/**
 * @author gopinath_mb
 */
public class StreamsTest {

  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();

    Collector res=null;
    //    Collection<Integer> res = new ArrayList<>();
    nums.stream().filter(i-> i%2==0).collect(res);
  }
}
