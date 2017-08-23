/**
 * 
 */
package com.ahu.solidprinciple.isp;

/**
 * @author aahu
 *
 */
public class DoorTimerAdapter implements TimerClient
{
private TimedDoor timedDoor;
public DoorTimerAdapter(TimedDoor theDoor)
{
timedDoor = theDoor;
}

@Override
public void TimeOut(int timeOutId) {
  // TODO Auto-generated method stub
  timedDoor.DoorTimeOut(timeOutId);

}
}
