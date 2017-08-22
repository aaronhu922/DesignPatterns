package com.ahu.solidprinciple.lsp;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

  @Test
  public void testGetArea() {
    Rectangle r = new Square();
//  Rectangle r = new Rectangle();
    r.setHeight(4);
    r.setWidth(5);
    assertTrue(20 == r.getArea());
  }

}
