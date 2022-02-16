<%--
  Created by IntelliJ IDEA.
  User: 张新远
  Date: 2022/2/16
  Time: 19:37
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
    <form action="user_updateGrade.action" method="post">
        正在为${userBean.uname}更换班级：
        <select name="gradeBean.gid" id="gradeBean.gid">
            <c:forEach items="${gradeBeanList}" var="g">
                <c:if test="${g.gid==userBean.gb.gid}">
                    <option value="${g.gid}" selected>${g.gname}</option>
                </c:if>
                <c:if test="${g.gid!=userBean.gb.gid}">
                    <option value="${g.gid}">${g.gname}</option>
                </c:if>
            </c:forEach>
        </select><br><br>
        <input type="submit" value="更换"><br><br>
        <input name="userBean.id" value="${userBean.id}" style="display: none"/>
    </form>
</center>
</body>
<script>
    console.log(gList);
</script>
</html>
