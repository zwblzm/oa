package cn.aurora.oa.business.ebi;

import java.util.List;

import cn.aurora.oa.vo.DepartmentModel;

public interface DepartmentEbi {

	List<DepartmentModel> findAll();

	

	DepartmentModel findDepartmentById(String parentId);

	void departmentAdd(DepartmentModel model);

	List<DepartmentModel> findDepartmentTopList();

	List<DepartmentModel> findDepartmentChildren(String parentId);

	void departmentDelete(String id);

}
