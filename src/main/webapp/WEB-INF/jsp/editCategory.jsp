<%--
  Created by IntelliJ IDEA.
  User: DIWEI
  Date: 2019/10/28
  Time: 8:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/categories/${category.id}" method="post">
    名称 <input type="text" name="name" value="${category.name}">

    <%--form 下增加 filed, 虽然这个form的method是post,
    但是springmvc看到这个_method的值是put后，会把其修改为put.--%>

    <input type="hidden" name="_method" value="PUT"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
