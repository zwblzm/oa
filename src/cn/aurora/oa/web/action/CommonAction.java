package cn.aurora.oa.web.action;

import org.springframework.stereotype.Controller;

import cn.aurora.oa.base.BaseAction;
import cn.aurora.oa.vo.RoleModel;

@Controller
public class CommonAction extends BaseAction<RoleModel>{
	
	public String topPage() {
		return "topPage";
	}
	
	public String leftPage() {
		return "leftPage";
	}
	
	public String bottomPage() {
		return "bottomPage";
	}
	
	public String rightPage() {
		return "rightPage";
	}
	
	

}
