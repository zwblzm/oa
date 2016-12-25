package cn.aurora.oa.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.aurora.oa.base.BaseAction;
import cn.aurora.oa.business.ebi.RoleEbi;
import cn.aurora.oa.vo.RoleModel;

/**
 * 岗位控制层
 * 
 * @author Administrator
 * 
 */
@Scope("prototype")
@Controller
public class RoleAction extends BaseAction<RoleModel> {
	@Resource
	private RoleEbi roleEbi;

	// 岗位列表界面
	public String roleListPage() {
		List<RoleModel> roleList = roleEbi.findAll();
		setValueStack("roleList", roleList);
		return "roleListPage";
	}

	// 岗位添加界面
	public String roleAddPage() {

		return "roleAddPage";
	}

	// 岗位修改界面
	public String roleUpdatePage() {

		RoleModel role = roleEbi.findRoleById(model.getId());
		pushModel(role);
		return "roleAddPage";
	}

	// 岗位添加
	public String roleAdd() {
		roleEbi.addRole(model);

		return "toRoleListPage";
	}

	// 岗位添加
	public String roleUpdate() {
		RoleModel role = roleEbi.findRoleById(model.getId());
		System.out.println(role);
		return "toRoleListPage";
	}

	// 岗位删除
	public String roleDelete() {

		roleEbi.deleteRole(model.getId());
		return "toRoleListPage";
	}

}
