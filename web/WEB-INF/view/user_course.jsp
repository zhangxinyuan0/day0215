<%--
  Created by IntelliJ IDEA.
  User: 张新远
  Date: 2022/2/16
  Time: 21:09
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
        <form action="user_updateCourse.action" method="post">
            <c:forEach items="${courseBeanList}" var="c">
                <input name="c.cid" value="c.cid" type="checkbox">${c.cname}
            </c:forEach>
        </form>
    </center>
</body>
</html>
