<%--
  Created by IntelliJ IDEA.
  User: DIWEI
  Date: 2019/10/27
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <script src="/lib/js/jquery.min.js"></script>
    <script>
        $(function() {
           $(".delete").click(function() {
               var href = $(this).attr("href");
               alert(href);
               //给id 为 fontDelete 的 action 属性赋值，并提交
               $("#formdelete").attr("action", href).submit();
               return false;
           });
        });


    </script>
</head>
<body>
    <table align="center" width="30%" border="1">
        <tr>
            <td>编号</td>
            <td>名称</td>
            <td>编辑</td>
        </tr>
        <c:forEach items="${cs}" var="c" varStatus="st">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td><a href="/categories/${c.id}">编辑</a></td>
                <td><a class="delete" href="/categories/${c.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <form action="categories" method="post">
        name: <input name="name" type="text"> <br>
        <button type="submit">提交</button>
    </form>

    <%--RESTful 风格的删除： 通过一个--%>
    <form id="formdelete" action="" method="post" >
        <input type="hidden" name="_method" value="delete">
    </form>
</body>
</html>
