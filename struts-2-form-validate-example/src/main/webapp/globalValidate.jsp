<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2018/12/31
  Time: 下午7:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <s:head></s:head>
</head>
<body>
<s:form action="gv/register" method="POST">
    <s:textfield name="username" label="Username" />
    <s:submit value="Register" />
</s:form>

<a href="/gv/anotherResult">Another Result</a>
<a href="/gv/otherResult">Other Result</a>
</body>
</html>
