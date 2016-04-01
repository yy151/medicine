package com.yubin.service;



import com.yubin.dao.BaseDao;

import java.io.Serializable;

/**
 * service接口
 * @author pzx
 *
 * @param <T>
 */
public interface BaseService<T> extends Serializable{
	
    // int deleteByPrimaryKey(Long id);

	/**
	 * 持久化对象
	 * @param record
	 * @return
	 */
    int save(T record);

    /**
     * 根据主键查找对象
     * @param id
     * @return
     */
    T findById(Long id);

    /**
     * 更新对象
     * @param record
     * @return
     */
    int update(T record);

	/**
	 * 获取当前service对应的dao
	 * @return
	 */
	BaseDao<T> getDao();
	
}
