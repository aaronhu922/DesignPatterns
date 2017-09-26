/**
 * 
 */
package com.ahu.solidprinciple.dip.bussiness;

import java.util.List;

/**
 * @author aahu
 *
 */
public interface IEntityManager {
//CRUD operations
  List<EntityBase> getAll();
  EntityBase get(long id);
  void save(EntityBase entity);
  void delete(long id);
}
