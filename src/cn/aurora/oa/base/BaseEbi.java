package cn.aurora.oa.base;

import java.util.List;

public interface BaseEbi<T> {
	
	public List<T> findAll();
	
	public void addModel(T model);

}
