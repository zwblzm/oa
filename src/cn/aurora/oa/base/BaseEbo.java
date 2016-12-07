package cn.aurora.oa.base;

import java.util.List;

import javax.annotation.Resource;

public class BaseEbo<T> implements BaseEbi<T>{
	@Resource
	protected BaseDao baseDao;
	@Override
	public List<T> findAll() {
		return baseDao.findAll();
		
	}
	@Override
	public void addModel(T model) {
		//TODO 开发通用添加用户接口层
		
	}

}
