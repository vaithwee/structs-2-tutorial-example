<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2018/12/23
  Time: 上午10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<c:url value="/login" />" method="post">
    Username:<input type="text" name="username" /><br />
    Password:<input type="text" name="password" /><br />
    <input type="submit" value="Login" />
</form>

<c:if test="${not empty msg}">
    <div><p>${msg}</p></div>
</c:if>
</body>
</html>
