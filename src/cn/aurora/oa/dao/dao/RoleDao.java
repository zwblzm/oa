package cn.aurora.oa.dao.dao;

import java.util.List;

import cn.aurora.oa.base.BaseDao;
import cn.aurora.oa.vo.RoleModel;

public interface RoleDao extends BaseDao<RoleModel>{

	List<RoleModel> findRoleByName(String roleName);

}
