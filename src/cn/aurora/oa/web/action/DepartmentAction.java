package cn.aurora.oa.web.action;

import java.util.List;

import org.springframework.stereotype.Controller;

import cn.aurora.oa.base.BaseAction;
import cn.aurora.oa.vo.DepartmentModel;
@Controller
public class DepartmentAction extends BaseAction<DepartmentModel>{
	
	//显示部门列表
	public String departmentListPage() {
		List<DepartmentModel> departmentList = departmentEbi.findAll();
		setValueStack("departmentList", departmentList);
		return "departmentListPage";
	}
	
	
	
	public String departmentDelete() {
		departmentEbi.deleteDepartment(model.getId());
		
		return "toDepartmentListPage";
		
	}
	
	
	
	

}
