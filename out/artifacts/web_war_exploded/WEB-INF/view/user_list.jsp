<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/2/15
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <table border="1" rules="all">
            <tr bgcolor="#ffe4c4">
                <th>编号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>生日</th>
                <th>班级</th>
                <th>课程</th>
                <th colspan="100">操作</th>
            </tr>
            <c:forEach items="${userList }" var="u">
                <tr>
                    <td>${u.id }</td>
                    <td>${u.uname }</td>
                    <td>${u.age }</td>
                    <td>${u.birthday }</td>
                    <td>${u.gb.gname }</td>
                    <td>
                        <c:forEach var="c" items="${u.courses }">
                            ${c.cname }--
                        </c:forEach>
                    </td>
                    <td>
                        <a href="user_deleteUser.action?userBean.id=${u.id}">删除</a>
                    </td>
                    <td>
                        <a href="user_findOneUser.action?id=${u.id}">修改</a>
                    </td>
                    <td>
                        <a href="user_findAllGrade.action?id=${u.id}">更换班级</a>
                    </td>
                    <td>
                        <a href="user_findAllCourse.action?id=${u.id}">选择课程</a>
                    </td>
                </tr>
            </c:forEach>
        </table>

    </center>
<jsp:include page="../../page/page.jsp"></jsp:include>
</body>
</html>
