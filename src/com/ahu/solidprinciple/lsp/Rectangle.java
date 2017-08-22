/**
 * 
 */
package com.ahu.solidprinciple.lsp;

import java.awt.Point;

/**
 * @author aahu
 *
 */
public class Rectangle {
  
  private Point topLeft;
  protected double width; 
  protected double height;
  
  public double getWidth() {
    return width;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  
  public double getArea(){
    return width*height;
  }

}
