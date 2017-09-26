/**
 * 
 */
package com.ahu.designpattern.bridge;

/**
 * @author aahu
 *
 */
public abstract class AbstractShape {
  protected DrawAPI drawAPI;
  
  protected AbstractShape(DrawAPI drawAPI){
     this.drawAPI = drawAPI;
  }
  public abstract void draw(); 
}