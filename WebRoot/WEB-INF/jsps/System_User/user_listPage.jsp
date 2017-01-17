<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>用户列表</title>
    <%@include file="/WEB-INF/jsps/public/header.jsp"%>
    <script type="text/javascript">
    </script>
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head"> 
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 用户管理
        
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
       
        <thead>
            <tr align=center valign=middle id=TableTitle>
                <td width="100">登录名</td>
                <td width="100">姓名</td>
                <td width="100">所属部门</td>
                <td width="200">岗位</td>
                <td>备注</td>
                <td>相关操作</td>
            </tr>
        </thead>
        
        <!--显示数据列表-->
        <tbody id="TableData">
        	<s:iterator value="userList">
            <tr class="TableDetail1 template">
                <td>${loginName}&nbsp;</td>
                <td>${realName}&nbsp;</td>
                <td>${department.departmentName}&nbsp;</td>
                <td>
					<s:iterator value="roles">
						${roleName}&nbsp;
					</s:iterator>

				</td>
                <td>${remark}&nbsp;</td>
                <td>
                	<s:a action="userAction_userDelete.do">
                		<s:param name="id" value="id"></s:param>
                		删除
                	</s:a>
                    <a href="saveUI.html">修改</a>
					<a href="#" onClick="return window.confirm('您确定要初始化密码为1234吗？')">初始化密码</a>
                </td>
            </tr>
            </s:iterator>
        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            
            <s:a action="userAction_userAddPage.do"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
        </div>
    </div>
</div>

</body>
</html>
