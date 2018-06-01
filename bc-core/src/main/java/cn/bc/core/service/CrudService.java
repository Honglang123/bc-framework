/**
 *
 */
package cn.bc.core.service;

import cn.bc.core.CrudOperations;
import cn.bc.core.dao.CrudDao;

/**
 * CRUDService接口
 *
 * @param <T> 对象类型
 * @author dragon
 */
public interface CrudService<T extends Object> extends CrudOperations<T> {

  /**
   * @return crudDao接口的实现
   */
  CrudDao<T> getCrudDao();
}
