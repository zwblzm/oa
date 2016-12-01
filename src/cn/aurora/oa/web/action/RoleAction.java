package cn.aurora.oa.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import cn.aurora.oa.base.BaseAction;
import cn.aurora.oa.business.ebi.RoleEbi;
import cn.aurora.oa.vo.RoleModel;
/**
 * 岗位控制层
 * @author Administrator
 *
 */


@Controller
public class RoleAction extends BaseAction<RoleModel>{
	@Resource
	private RoleEbi roleEbi;
	
	
	
	
	//岗位列表界面
	public String roleListPage() {
		List<RoleModel> roleList = roleEbi.findAll();
		setValueStack("roleList", roleList);
		return "roleListPage";
	}
	
	
	
	
	
	
	
	

}
