<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019/1/1
  Time: 下午10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:property value="'hello world'" />
<s:property value="'hello world'.length()" />
<s:property value="@java.lang.Integer@MAX_VALUE" />
<s:property value="@java.lang.Math@random()" />
</body>
</html>
