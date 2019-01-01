<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2019/1/1
  Time: 下午7:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:actionerror></s:actionerror>
<h2>Single File Upload</h2>
<s:form action="upload" method="POST" enctype="multipart/form-data">
    <s:file name="file" />
    <s:submit value="Upload" />
</s:form>

<h2>Multiple File Upload</h2>
<s:form action="uploadFiles" method="POST" enctype="multipart/form-data">
    <s:file name="files" />
    <s:file name="files" />
    <s:file name="files" />
    <s:submit value="Upload" />
</s:form>
</body>
</html>
