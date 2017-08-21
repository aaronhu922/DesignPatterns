/**
 * 
 */
package com.ahu.designpattern.command;

/**
 * @author aahu
 *
 */
public class ShutoffCommand implements Command {

  /* (non-Javadoc)
   * @see com.ahu.designpattern.command.Command#execute()
   */
  @Override
  public void execute() {
    System.out.println("This is a shut off command!");
  }

}
