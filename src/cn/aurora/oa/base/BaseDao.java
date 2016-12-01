package cn.aurora.oa.base;

import java.util.List;

public interface BaseDao<T> {
	
	public void addModel(T model);
	public void updateModel(T model);
	public void deleteModel(T model);
	public T findById(String id);
	public List<T> findAll();
	public List<T> findByIds(String[] ids);
	
	

}
