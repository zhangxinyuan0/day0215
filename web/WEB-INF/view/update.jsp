<%--
  Created by IntelliJ IDEA.
  User: 张新远
  Date: 2022/2/16
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="user_updateUser.action" method="post">
        <input type="text" name="userBean.id" value="${userBean.id}" readonly/><br><br>
        <input type="text" name="userBean.uname" value="${userBean.uname}"/><br><br>
        <input type="text" name="userBean.age" value="${userBean.age}"/><br><br>
        <input type="date" name="userBean.birthday" value="${userBean.birthday}"/><br><br>
        <input type="submit" value="修改"/>
    </form>
</center>
</body>
</html>
