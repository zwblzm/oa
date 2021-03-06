package cn.aurora.oa.vo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserModel {
	private String id;
	private String loginName;
	
	private String realName;
	private String password;
	private String telephone;
	private Integer gender;
	private String email;
	private String remark;
	private Set<RoleModel> roles = new HashSet<RoleModel>();
	
	private DepartmentModel department;
	private Long createTime;
	
	private static final String GENDER_VIEW_MAN="男";
	private static final String GENDER_VIEW_WOMAN="女";
	private static final Integer GENDER_MAN=1;
	private static final Integer GENDER_WOMAN=2;
	
	public static final Map<Integer, String> genderMap = new HashMap<Integer, String>();
	static {
		
			genderMap.put(GENDER_MAN, GENDER_VIEW_MAN);
			genderMap.put(GENDER_WOMAN, GENDER_VIEW_WOMAN);
		
		
	}
	
	
	
	private String genderView;
	
	
	
	
	
	
	
	
	
	public String getGenderView() {
		return genderView;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", loginName=" + loginName
				+ ", realName=" + realName + ", telephone=" + telephone
				+ ", gender=" + gender + ", email=" + email + ", remark="
				+ remark + ", createTime=" + createTime + "]";
	}
	public Set<RoleModel> getRoles() {
		return roles;
	}
	public void setRoles(Set<RoleModel> roles) {
		this.roles = roles;
	}
	public DepartmentModel getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}
	
	
	
	
	
	

}
