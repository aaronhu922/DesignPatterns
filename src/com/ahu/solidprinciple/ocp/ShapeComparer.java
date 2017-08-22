/**
 * 
 */
package com.ahu.solidprinciple.ocp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aahu
 *
 */
public class ShapeComparer implements Comparable<Shape> {
  
  private static Map<Shape, Integer> priorities = new HashMap<>();
  
  @Override
  public int compareTo(Shape o) {
    // TODO Auto-generated method stub
    return 0;
  }

}
