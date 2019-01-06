<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-06
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Name Collector</title>
</head>
<body>
Enter your name so that we can customize a greeting just for you!
<s:form action="/helloWorld" method="POST">
    <s:textfield name="name" label="Your Name" />
    <s:submit value="Sumbit" />
</s:form>
</body>
</html>
