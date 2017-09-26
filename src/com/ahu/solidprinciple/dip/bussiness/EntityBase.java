/**
 * 
 */
package com.ahu.solidprinciple.dip.bussiness;

import java.util.Date;

/**
 * @author aahu
 *
 */
public abstract class EntityBase {

  public long Id;
  public String name;
  public Date createDate;
  public String updateBy;
  public boolean isChanged;

  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }

  public boolean isChanged() {
    return isChanged;
  }

  public void setChanged(boolean isChanged) {
    this.isChanged = isChanged;
  }

}
