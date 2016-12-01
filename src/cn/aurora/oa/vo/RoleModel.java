package cn.aurora.oa.vo;
/**
 * 岗位实体类
 * @author Administrator
 *
 */
public class RoleModel {
	
	private String id;
	private String roleName;
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "RoleModel [id=" + id + ", roleName=" + roleName
				+ ", description=" + description + "]";
	}
	
	

}
