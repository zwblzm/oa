package cn.aurora.oa.web.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

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

	// 岗位修改
	public String roleUpdate() {
		RoleModel role = roleEbi.findRoleById(model.getId());
		role.setRoleName(model.getRoleName());
		role.setDescription(model.getDescription());
		
		
		
		roleEbi.updateRole(role);
		return "toRoleListPage";
	}

	// 岗位删除
	public String roleDelete() {

		roleEbi.deleteRole(model.getId());
		return "toRoleListPage";
	}
	
	
	
	
	public String checkRoleName() {
		List<RoleModel> roles = roleEbi.findRoleByName(model.getRoleName());
		
		
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		
		PrintWriter writer=null;
		
		try {
			writer = ServletActionContext.getResponse().getWriter();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		if(roles.size()>0&& roles!=null) {
			
			
			writer.print("1");
			
		}else {
			writer.print("0");
		}
		
		return NONE;
	}

}
