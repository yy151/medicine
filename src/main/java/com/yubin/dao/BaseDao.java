package com.yubin.dao;


/**
 * Dao 基类，包含了公共的必须要提供实现的dao方法
 * @author pzx
 *
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * 根据主键删除数据
	 * @param id
	 * @return
	 */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据
     * @param record
     * @return
     */
    int insert(T record);

    /**
     * 根据主键查找对象
     * @param id
     * @return
     */
    T selectByPrimaryKey(Long id);

    /**
     * 更新对象
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);

}