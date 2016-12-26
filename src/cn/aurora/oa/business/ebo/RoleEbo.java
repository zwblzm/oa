package cn.aurora.oa.business.ebo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.aurora.oa.business.ebi.RoleEbi;
import cn.aurora.oa.dao.dao.RoleDao;
import cn.aurora.oa.utils.UUIDUtils;
import cn.aurora.oa.vo.RoleModel;

@Service
public class RoleEbo implements RoleEbi{

	@Resource
	private RoleDao roleDao;
	
	
	
	
	@Override
	public void addRole(RoleModel model) {
		model.setId(UUIDUtils.getUUID());
		roleDao.addModel(model);
		
	}




	@Override
	public void deleteRole(String id) {
		RoleModel role = roleDao.findById(id);
		if(role != null) {
			
			
			roleDao.deleteModel(role);
			
		}
	}




	@Override
	public List<RoleModel> findAll() {
		List<RoleModel> roles = roleDao.findAll();
		return roles;
	}




	@Override
	public RoleModel findRoleById(String id) {
		RoleModel role = roleDao.findById(id);
		return role;
	}




	@Override
	public void updateRole(RoleModel role) {
		roleDao.updateModel(role);
		
	}




	@Override
	public List<RoleModel> findRoleByName(String roleName) {
		List<RoleModel> roles = roleDao.findRoleByName(roleName);
		return roles;
	}

}
