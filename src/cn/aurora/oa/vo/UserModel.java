package cn.aurora.oa.vo;

public class UserModel {
	private String id;
	private String loginName;
	private String realName;
	private String telephone;
	private Integer gender;
	private String email;
	private String remark;
	private Long createTime;
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
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", loginName=" + loginName
				+ ", realName=" + realName + ", telephone=" + telephone
				+ ", gender=" + gender + ", email=" + email + ", remark="
				+ remark + ", createTime=" + createTime + "]";
	}
	
	
	
	
	
	
	

}
