<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>ItcastOA</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<frameset rows="100,*,25" framespacing="0" border="0" frameborder="0">
    <frame src="${pageContext.request.contextPath}/commonAction_topPage.do" name="TopMenu"  scrolling="no" noresize />
    <frameset cols="180,*" id="resize">
        <frame noresize name="menu" src="${pageContext.request.contextPath}/commonAction_leftPage.do" scrolling="no" />
        <frame noresize name="right" src="${pageContext.request.contextPath}/commonAction_rightPage.do" scrolling="yes" />
    </frameset>
    <frame noresize name="status_bar" scrolling="no" src="${pageContext.request.contextPath}/commonAction_bottomPage.do" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>