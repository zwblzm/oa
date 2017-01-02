<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>部门列表</title>
    <%@include file="/WEB-INF/jsps/public/header.jsp"%>
    <script type="text/javascript">
    </script>
</head>
<body>
 <s:debug></s:debug>
 <hr/>
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 部门管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align=center valign=middle id=TableTitle>
            	<td width="150px">部门名称</td>
				<td width="150px">上级部门名称</td>
				<td width="200px">职能说明</td>
				<td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" >
        <s:iterator value="departmentList">
			<tr class="TableDetail1 template">
				<td>
					<s:a action="departmentAction_departmentListPage.do">${departmentName}
						<s:param name="parentId" value="id"></s:param>
					
					</s:a>
				
				
				&nbsp;</td>
				<td>${parent.departmentName}&nbsp;</td>
				<td>${description}&nbsp;</td>
				<td>
					<s:a action="departmentAction_departmentDelete.do">
					<s:param name="id" value="id"></s:param>
					删除
						
					</s:a>
				
				
				
					
					<s:a action="departmentAction_departmentUpdatePage.do?id=%{id}">修改</s:a>
				</td>
			</tr>
		</s:iterator>
        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <s:a action="departmentAction_departmentAddPage.do"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
            <s:if test="%{parentId!=null}">
            	<s:a action="departmentAction_departmentListPage.do">
            	
            	<s:param name="parentId" value="parentId"></s:param>
            	<IMG SRC="${pageContext.request.contextPath}/style/blue/images/button/ReturnToPrevLevel.png" /></s:a>
            </s:if>
        </div>
    </div>
</div>

<!--说明-->	
<div id="Description"> 
	说明：<br />
	1，列表页面只显示一层的（同级的）部门数据，默认显示最顶级的部门列表。<br />
	2，点击部门名称，可以查看此部门相应的下级部门列表。<br />
	3，删除部门时，同时删除此部门的所有下级部门。
</div>

</body>
</html>
