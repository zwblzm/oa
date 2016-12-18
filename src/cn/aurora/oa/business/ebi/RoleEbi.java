package cn.aurora.oa.business.ebi;

import java.util.List;

import cn.aurora.oa.vo.RoleModel;

public interface RoleEbi {
	public void addRole(RoleModel model);

	public void deleteRole(String id);

	public List<RoleModel> findAll();

	public RoleModel findRoleById(String id);

}
