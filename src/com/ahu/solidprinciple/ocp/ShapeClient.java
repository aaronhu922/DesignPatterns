/**
 * 
 */
package com.ahu.solidprinciple.ocp;

import java.util.Comparator;
import java.util.List;

/**
 * @author aahu
 *
 */
public class ShapeClient {
  
  private List<Shape> slist = null;
  
  public void drawShapes(List<Shape> sList){
    sList.sort((Comparator<Shape>) new ShapeComparer());
    for (Shape shape : sList) {
      shape.draw();
    }
  }
  
  /*
   *Violating the OCP rule.
   */
  public void drawShapesNotOCP(List<Object> sList){
    for (Object shape : sList) {
       if (shape instanceof Circle) {
        ((Circle) shape).draw();
      }else{
        
      }
    }
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
