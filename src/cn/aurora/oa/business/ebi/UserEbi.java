package cn.aurora.oa.business.ebi;

import java.util.List;

import cn.aurora.oa.vo.UserModel;

public interface UserEbi {

	void userAdd(UserModel model);

	List<UserModel> findAllUser();

	void userDelete(String id);

}
