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

}
