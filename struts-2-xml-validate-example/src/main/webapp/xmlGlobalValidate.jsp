<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2018/12/31
  Time: 下午8:55
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
<s:form action="xgv/register">
    <s:textfield name="username" label="username" />
    <s:submit value="Resigeter" />
</s:form>

<h2><a href="/xgv/otherResult">Other Result</a> </h2>
</body>
</html>
