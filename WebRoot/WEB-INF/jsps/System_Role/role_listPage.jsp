<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>岗位列表</title>
   	<%@include file="/WEB-INF/jsps/public/header.jsp"%>
    <script type="text/javascript">
    </script>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 岗位管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
            	<td width="200px">选择</td>
            	<td width="200px">岗位名称</td>
                <td width="300px">岗位说明</td>
                <td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" >
			
			
			<s:iterator value="roleList" >
			<tr class="TableDetail1 template">
				<td><input type="checkbox"/></td>
				<td>${roleName}&nbsp;</td>
				<td>${description}&nbsp;</td>
				<td>
					<s:a action="roleAction_roleDelete.do" >
					
					<s:param name="id" value="id"></s:param>
					
					删除
					
						
					
					</s:a>
					
					<s:a action="roleAction_roleUpdatePage.do">
					<s:param name="id" value="id"></s:param>
					修改
					
					</s:a>
					
					
					<a href="setPrivilegeUI.html">设置权限</a>
				</td>
			</tr>
			
			
			
			</s:iterator>
			
			
        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
          
            <s:a action="roleAction_roleAddPage.do"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
        </div>
    </div>
</div>
</body>
</html>
