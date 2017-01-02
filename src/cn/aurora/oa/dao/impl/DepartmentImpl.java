package cn.aurora.oa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.aurora.oa.base.BaseDaoImpl;
import cn.aurora.oa.dao.dao.DepartmentDao;
import cn.aurora.oa.vo.DepartmentModel;
@Repository
public class DepartmentImpl extends BaseDaoImpl<DepartmentModel> implements DepartmentDao{

	@Override
	public List<DepartmentModel> findDepartmentTopList() {
		String hql="FROM DepartmentModel dep where parentId is null order by id desc";
		
		List<DepartmentModel> departmentList = this.getHibernateTemplate().find(hql);
		return departmentList;
	}

	@Override
	public List<DepartmentModel> findDepartmentChildren(String parentId) {
		
		String hql = "FROM DepartmentModel dep where parentId=? order by id desc";
		List<DepartmentModel> departmentList = this.getHibernateTemplate().find(hql, parentId);
		return departmentList;
	}

}
