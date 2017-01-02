package cn.aurora.oa.dao.dao;

import java.util.List;

import cn.aurora.oa.base.BaseDao;
import cn.aurora.oa.vo.DepartmentModel;

public interface DepartmentDao extends BaseDao<DepartmentModel>{

	List<DepartmentModel> findDepartmentTopList();

	List<DepartmentModel> findDepartmentChildren(String parentId);

}
