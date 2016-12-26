package cn.aurora.oa.web.action;

import java.util.List;

import org.springframework.stereotype.Controller;

import cn.aurora.oa.base.BaseAction;
import cn.aurora.oa.vo.DepartmentModel;
@Controller
public class DepartmentAction extends BaseAction<DepartmentModel>{
	
	private String parentId;//属性驱动
	
	//显示部门列表
	public String departmentListPage() {
		List<DepartmentModel> departmentList = departmentEbi.findAll();
		setValueStack("departmentList", departmentList);
		return "departmentListPage";
	}
	
	
	//部门删除
	public String departmentDelete() {
		departmentEbi.deleteDepartment(model.getId());
		
		return "toDepartmentListPage";
		
	}
	
	
	//部门添加界面
	public String departmentAddPage() {
		List<DepartmentModel> departmentList = departmentEbi.findAll();
		setValueStack("departmentList", departmentList);
 		return "departmentAddPage";
	}
	
	//部门添加
	public String departmentAdd() {
		if(parentId!=null && parentId!=""){
			DepartmentModel parent = departmentEbi.findDepartmentById(parentId);
			model.setParent(parent);
			departmentEbi.departmentAdd(model);
			
			
			
		}
		
		
		
		
		
		
		
		
		return "toDepartmentListPage";
	}

	
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	
	

}
