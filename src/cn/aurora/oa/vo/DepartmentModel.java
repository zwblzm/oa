package cn.aurora.oa.vo;

import java.util.HashSet;
import java.util.Set;

public class DepartmentModel {

	 private String id;
	 private String departmentName;
	 private String description;
	 
	 private DepartmentModel parent;
	 
	 private Set<DepartmentModel> children = new HashSet<DepartmentModel>();
	 public DepartmentModel getParent() {
		return parent;
	}
	public void setParent(DepartmentModel parent) {
		this.parent = parent;
	}
	public Set<DepartmentModel> getChildren() {
		return children;
	}
	public void setChildren(Set<DepartmentModel> children) {
		this.children = children;
	}
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	 
	 
	 
	 
}
