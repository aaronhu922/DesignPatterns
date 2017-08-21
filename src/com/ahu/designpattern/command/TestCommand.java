/**
 * 
 */
package com.ahu.designpattern.command;

/**
 * @author aahu
 *
 */
public class TestCommand implements Command {

  /*
   * (non-Javadoc)
   * 
   * @see com.ahu.designpattern.command.Command#execute()
   */
  @Override
  public void execute() {
    System.out.println("This is a test command!");
  }

}
