<%--
  Created by IntelliJ IDEA.
  User: zqh07233
  Date: 2016/5/27
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H4>value from inteceptor 处理耗时:${handlingTime}ms</H4>

<form action="/horizonio-quartz/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/><br/>
    <input type="submit" value="上传">
</form>

</body>
</html>
