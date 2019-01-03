<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019/1/3
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>Status</td>
        <td>Name</td>
        <td>Age</td>
        <td>City</td>
    </tr>

<s:iterator value="students" var="student" status="status">
    <tr>
        <td>${status.index}</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
        <td>${student.city}</td>
    </tr>
</s:iterator>
</table>
<s:debug></s:debug>
</body>
</html>
