package com.ahu.solidprinciple.dip.bussiness;

public class Teacher extends EntityBase {
  public String employeeId;
  public String[] subjectsTaught;

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String[] getSubjectsTaught() {
    return subjectsTaught;
  }

  public void setSubjectsTaught(String[] subjectsTaught) {
    this.subjectsTaught = subjectsTaught;
  }
}
