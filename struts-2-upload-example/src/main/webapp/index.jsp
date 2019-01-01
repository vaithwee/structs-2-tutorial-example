<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019/1/1
  Time: 下午2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="upload" method="POST" enctype="multipart/form-data">
    <s:file name="file" />
    <s:submit value="Upload" />
</s:form>
</body>
</html>
