package com.ahu.solidprinciple.dip;

public class Lamp implements ButtonServer {

  public void turnOff() {
  System.out.println("Turn off.");
  }

  public void turnOn() {
    System.out.println("Turn on.");

  }

}
