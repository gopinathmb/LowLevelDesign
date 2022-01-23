/**
 * Created by gopinath_mb on Jan 23, 2022
 */
package com.concept.functionalint;

/**
 * @author gopinath_mb
 */
public class FunctionalInterfacesTest {

}

@FunctionalInterface
interface FuncInt1 {

  public String m1(String s);

  default public String m2(String s) {
    return "returning from default method";
  }

  public static String m3(String s) {
    return "returning from default static method";
  }
}

//adding everything fromm fi1 is fine
@FunctionalInterface
interface FuncInt2 extends FuncInt1 {

  public String m1(String s);

  default public String m2(String s) {
    return "returning from default method";
  }

  public static String m3(String s) {
    return "returning from default static method";
  }
}

@FunctionalInterface
interface FuncInt3 extends FuncInt1 {
//keeping empty is ok
}

@FunctionalInterface
interface FuncInt4 extends FuncInt1 {

  // Adding same signature as is ok
  public String m1(String s);
}

@FunctionalInterface
interface FuncInt5 extends FuncInt1 {

  // If u uncomment it will fail as it will not be functional interface.
//   public String m5(String s);
}

//You can extend functional interface and not specifying it as FunctionalInterface is also fine and it will not work as functional interface. 
interface FuncInt6 extends FuncInt1 {

  public String m2(String s);

  public String m3(String s);

  public String m4(String s);
}
