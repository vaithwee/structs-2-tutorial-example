<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-04
  Time: 08:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="/login" method="POST">
    <s:textfield name="username" label="Username" />
    <s:textfield name="password" label="Password" />
    <s:token />
    <s:submit value="Login" />
</s:form>
</body>
</html>
