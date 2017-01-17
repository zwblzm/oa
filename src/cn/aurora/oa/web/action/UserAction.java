package cn.aurora.oa.web.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.aurora.oa.base.BaseAction;
import cn.aurora.oa.utils.DepartmentUtils;
import cn.aurora.oa.vo.DepartmentModel;
import cn.aurora.oa.vo.UserModel;
@Controller

@Scope("prototype")
public class UserAction extends BaseAction<UserModel>{
	//用户列表
	public String userListPage() {
		List<UserModel> userList = userEbi.findAllUser();
		setValueStack("userList", userList);
		return "userListPage";
	}
	
	//用户添加界面
	public String userAddPage() {
		List<DepartmentModel> top = departmentEbi.findDepartmentTopList();
		List<DepartmentModel> tree = DepartmentUtils.getTreeList(top, null);
		
		setValueStack("departmentList", tree);
		return "userAddPage";
	}
	
	//用户添加功能
	public String userAdd() {
		userEbi.userAdd(model);
		
		return "toUserListPage";
	}
	
	//用户删除功能
	public String userDelete() {
		userEbi.userDelete(model.getId());
		
		return "toUserListPage";
		
	}
	
	

}
