<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-06
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Name Collector</title>
    <s:head></s:head>
</head>
<body>
Enter your name so that we can customize a greeting just for you!
<s:form action="HelloWorld" method="POST">
    <s:textfield label="Your name" name="name"/>
    <s:submit value="Submit" />
</s:form>

</body>
</html>
