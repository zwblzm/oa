package cn.aurora.oa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.aurora.oa.base.BaseDaoImpl;
import cn.aurora.oa.dao.dao.RoleDao;
import cn.aurora.oa.vo.RoleModel;


@Repository
public class RoleImpl extends BaseDaoImpl<RoleModel> implements RoleDao{

	@Override
	public List<RoleModel> findRoleByName(String roleName) {
		String hql="from RoleModel where roleName=?";
		List<RoleModel> roles = this.getHibernateTemplate().find(hql, roleName);
		return roles;
	}

}
