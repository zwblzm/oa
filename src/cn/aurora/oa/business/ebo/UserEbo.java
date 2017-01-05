package cn.aurora.oa.business.ebo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.aurora.oa.business.ebi.UserEbi;
import cn.aurora.oa.dao.dao.UserDao;
import cn.aurora.oa.utils.UUIDUtils;
import cn.aurora.oa.vo.UserModel;
@Service
public class UserEbo implements UserEbi{

	@Resource
	private UserDao userDao;
	@Override
	public void userAdd(UserModel model) {
		model.setId(UUIDUtils.getUUID());
		userDao.addModel(model);
	}
	@Override
	public List<UserModel> findAllUser() {
		List<UserModel> userList = userDao.findAll();
		return userList;
	}

}
