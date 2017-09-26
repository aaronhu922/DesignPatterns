/**
 * 
 */
package com.ahu.solidprinciple.dip.bussiness;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aahu
 *
 */
public class StudentsManager implements IEntityManager {

  /* (non-Javadoc)
   * @see com.ahu.solidprinciple.dip.bussiness.IEntityManager#getAll()
   */
  @Override
  public List<EntityBase> getAll() {
    // TODO Auto-generated method stub
    return new ArrayList<EntityBase>();
  }

  /* (non-Javadoc)
   * @see com.ahu.solidprinciple.dip.bussiness.IEntityManager#get(long)
   */
  @Override
  public EntityBase get(long id) {
    // TODO Auto-generated method stub
    return new Students();
  }

  /* (non-Javadoc)
   * @see com.ahu.solidprinciple.dip.bussiness.IEntityManager#save(com.ahu.solidprinciple.dip.bussiness.EntityBase)
   */
  @Override
  public void save(EntityBase entity) {
    // TODO Auto-generated method stub

  }

  /* (non-Javadoc)
   * @see com.ahu.solidprinciple.dip.bussiness.IEntityManager#delete(long)
   */
  @Override
  public void delete(long id) {
    // TODO Auto-generated method stub

  }

}
