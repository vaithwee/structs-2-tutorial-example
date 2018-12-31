<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <s:head></s:head>
</head>
<body>
<h2>Validate Type</h2>
<s:debug />
<s:form action="register" method="POST">
    <s:textfield name="username" label="Username" />
    <s:textfield name="password" label="Password" />
    <s:textfield name="repassword" label="Repassword" />
    <s:textfield name="age" label="Age" />
    <s:textfield name="email" label="Email" />
    <s:radio list="#{'1':'Male','2':'Female'}" name="sex" label="Sex" />
    <s:submit value="Register" />
</s:form>
</body>
</html>
