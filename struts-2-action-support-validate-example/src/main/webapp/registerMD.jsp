<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-06
  Time: 21:55
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
<s:form action="/modelDrivenRegister" method="POST">
    <s:textfield name="username" label="Username" /><br />
    <s:password name="password" label="Password" /><br />
    <s:textfield name="portfolioName" label="Enter a name for your portfolio" /><br />
    <s:submit value="Register" />
</s:form>
</body>
</html>
