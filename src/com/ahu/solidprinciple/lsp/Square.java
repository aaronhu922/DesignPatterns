/**
 * 
 */
package com.ahu.solidprinciple.lsp;

/**
 * @author aahu
 * Illustrate the LSP principle.
 *
 */
public class Square extends Rectangle {
  public void setWidth(double width) {
    this.width = width;
    this.height = width;
  }

  public void setHeight(double height) {
    this.height = height;
    this.width=height;
  }
}
