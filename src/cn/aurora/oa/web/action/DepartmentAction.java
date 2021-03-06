package cn.aurora.oa.web.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.aurora.oa.base.BaseAction;
import cn.aurora.oa.utils.DepartmentUtils;
import cn.aurora.oa.vo.DepartmentModel;
@Controller
@Scope("prototype")
public class DepartmentAction extends BaseAction<DepartmentModel>{
	
	private String parentId;//属性驱动
	
	//显示部门列表
	public String departmentListPage() {
		
		
		
		
		List<DepartmentModel> departmentList = new ArrayList<DepartmentModel>();
		
		if(parentId ==null || "".equals(parentId)) {
			parentId=null;
			departmentList = departmentEbi.findDepartmentTopList();
			
			
		}else {
			
			departmentList = departmentEbi.findDepartmentChildren(parentId);
			DepartmentModel department = departmentEbi.findDepartmentById(parentId);
			
			pushModel(department);
//			
		}
		
		
		
		
		
		
		setValueStack("departmentList", departmentList);
		return "departmentListPage";
	}
	
	
	//部门删除
	public String departmentDelete() {
		departmentEbi.departmentDelete(model.getId());
		
		return "toDepartmentListPage";
		
	}
	
	
	//部门添加界面
	public String departmentAddPage() {

		List<DepartmentModel> topList = departmentEbi.findDepartmentTopList();
		
		List<DepartmentModel> tree = DepartmentUtils.getTreeList(topList, null);
		setValueStack("departmentList", tree);
		
		
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
	
	
	//修改部门界面
	public String departmentUpdatePage() {
		//修改界面页面回显
		DepartmentModel department = departmentEbi.findDepartmentById(model.getId());
		
		if(department.getParent()!=null) {
			
			
			parentId=department.getParent().getId();
		}
		pushModel(department);
		
		
		//准备部门列表数据
		List<DepartmentModel> departmentList = departmentEbi.findAll();
		
		
		setValueStack("departmentList", departmentList);
		return "departmentAddPage";
	}
	
	
	
	//部门修改
	public String departmentUpdate() {
		
		
		
		return "toDepartmentListPage";
	}

	
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}


	public String getParentId() {
		return parentId;
	}
	
	
	

}
