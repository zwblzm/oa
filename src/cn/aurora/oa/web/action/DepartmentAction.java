package cn.aurora.oa.web.action;

import org.springframework.stereotype.Controller;

import cn.aurora.oa.base.BaseAction;
import cn.aurora.oa.vo.DepartmentModel;
@Controller
public class DepartmentAction extends BaseAction<DepartmentModel>{
	
	//显示部门列表
	public String departmentListPage() {
		
		
		return "departmentListPage";
	}
	
	
	
	

}
