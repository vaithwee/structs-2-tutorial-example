<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <s:head></s:head>
</head>
<body>
<h2>Normal Html Tag</h2>
<form action="/register" method="post">
    Username:<input type="text" name="username" /><br />
    Password:<input type="password" name="password" /><br />
    Birthday:<input type="date" name="birthday" /><br />
    Hobby:
    <input type="checkbox" name="hobby" value="Football" />Football
    <input type="checkbox" name="hobby" value="Basketball" />Basketball
    <input type="checkbox" name="hobby" value="Bicycle" />Bicycle<br />
    Sex:<input type="radio" name="sex" value="1" />Male
    <input type="radio" name="sex" value="2" />Female<br />
    <input type="submit" value="Register" />
</form>

<hr />
<h2>Struts Html Tag</h2>
<s:form action="register" method="POST">
    <s:textfield name="username" label="Username" requiredLabel="true" requiredPosition="right"/>
    <s:password name="password" label="Password" />
    <s:textfield name="birthday" label="Birthday" />
    <s:checkboxlist list="#{'Football':'Football','Basketball':'Basketball','Bicycle':'Bicycle'}" label="Hobby" name="hobby" />
    <s:radio list="#{'1':'Male','2':'Female'}" label="Sex" name="sex" />
    <s:submit value="Register" />
</s:form>
</body>
</html>
