<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:requestEncoding value="UTF-8" />
<%
    ResourceBundle bundle = ResourceBundle.getBundle("local.text", Locale.CHINA);
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<h2>Hello World!</h2>
<%=bundle.getString("greeting")%> <br />
<fmt:bundle basename="local.text">
    <fmt:message key="greeting" />
</fmt:bundle>
</body>
</html>
