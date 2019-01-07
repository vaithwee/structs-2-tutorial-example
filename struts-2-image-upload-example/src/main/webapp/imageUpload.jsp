<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019-01-07
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Image Upload</title>
</head>
<body>
<h4>Complete and submit the form to create your own portfolio.</h4>
<s:form action="imageUpload" method="POST" enctype="multipart/form-data">
    <s:file name="pic" label="Picture" />
    <s:submit />
</s:form>
</body>
</html>
