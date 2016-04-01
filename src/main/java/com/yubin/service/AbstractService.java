package com.yubin.service;


import com.nfc.common.dao.BaseDao;

/**
 * Service方法抽象类，基本操作方法的实现
 * @author pzx
 *
 * @param <T>
 */
public abstract class AbstractService<T> implements BaseService<T>{
	
	private static final long serialVersionUID = -342253232886735838L;

	public int save(T t){
		return this.getDao().insert(t);
	}
	
	public int update(T t){
		return this.getDao().updateByPrimaryKeySelective(t);
	}

	public T findById(Long id) {
		return this.getDao().selectByPrimaryKey(id);
	}

	public abstract BaseDao<T> getDao();
}