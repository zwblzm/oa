package cn.aurora.oa.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cn.aurora.oa.vo.DepartmentModel;
/**
 * 部门树状结构显示
 * @author Administrator
 *
 */
public class DepartmentUtils {
	
	
	public static List<DepartmentModel> getTreeList(Collection<DepartmentModel> topList,String removeId) {
		List<DepartmentModel> treeList = new ArrayList<DepartmentModel>();
		treeList = walkTree(topList,treeList," ",removeId);
		
		
		
		return treeList;
	}

	private static List<DepartmentModel> walkTree(Collection<DepartmentModel> topList, List<DepartmentModel> treeList,String prefix,String removeId) {
		
		for (DepartmentModel department : topList) {
			department.setDepartmentName(prefix+department.getDepartmentName());
			treeList.add(department);
			if(department.getChildren().size()>0) {
				
				
				walkTree(department.getChildren(), treeList,prefix+"|_",removeId);
			}
		}
		
		return treeList;
		
		
	}
	

}
