package cn.aurora.oa.business.ebi;

import java.util.List;

import cn.aurora.oa.vo.DepartmentModel;

public interface DepartmentEbi {

	List<DepartmentModel> findAll();

	void deleteDepartment(String id);

	DepartmentModel findDepartmentById(String parentId);

	void departmentAdd(DepartmentModel model);

}
