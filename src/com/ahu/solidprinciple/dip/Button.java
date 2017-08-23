/**
 * 
 */
package com.ahu.solidprinciple.dip;

/**
 * @author aahu
 *
 */
public class Button {
  private Lamp lamp;
//  private ButtonServer lampAbstract;


  public void Poll() {
    if (true)
      lamp.turnOn();
    
//    lampAbstract.turnOn();
  }
}
