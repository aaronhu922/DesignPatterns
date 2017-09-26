/**
 * 
 */
package com.ahu.designpattern.bridge;

/**
 * @author aahu
 *
 */
public class BridgePatternMain {
    public static void main(String[] args) {
       AbstractShape redCircle = new Circle(100,100, 10, new RedCircle());
       AbstractShape greenCircle = new Circle(100,100, 10, new GreenCircle());

       redCircle.draw();
       greenCircle.draw();
    }
 
}
