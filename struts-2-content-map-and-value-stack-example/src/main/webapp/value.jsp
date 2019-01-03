<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019/1/3
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

username in value stack: <s:property value="username" /> <br />
password in value stack: <s:property value="password" /> <br />

username in content: <s:property value="#username" /> <br />
username in session: <s:property value="#session.username" /> <br />

username in request: <s:property value="#request.username" /> <br />


<s:debug></s:debug>
</body>
</html>
