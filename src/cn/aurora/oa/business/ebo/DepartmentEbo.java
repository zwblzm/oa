package cn.aurora.oa.business.ebo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.aurora.oa.business.ebi.DepartmentEbi;
import cn.aurora.oa.dao.dao.DepartmentDao;
import cn.aurora.oa.vo.DepartmentModel;
@Service
public class DepartmentEbo implements DepartmentEbi{

	@Resource
	private DepartmentDao departmentDao;
	
	
	
	@Override
	public List<DepartmentModel> findAll() {
		List<DepartmentModel> departmentList = departmentDao.findAll();
		return departmentList;
	}



	@Override
	public void deleteDepartment(String id) {
		DepartmentModel department = departmentDao.findById(id);
		if(department != null) {
			
			departmentDao.deleteModel(department);
			
			
		}
	}

}
