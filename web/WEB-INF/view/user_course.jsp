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
                    <c:if test="${c.shu==1}">
                        <input name="courseshu" value="${c.cid}" type="checkbox" checked>${c.cname}
                    </c:if>
                    <c:if test="${c.shu!=1}">
                        <input name="courseshu" value="${c.cid}" type="checkbox" >${c.cname}
                    </c:if>
            </c:forEach>
            <input name="userBean.id" value="${userBean.id}" style="display: none"/>
            <input type="submit" value="提交">
        </form>
    </center>
</body>
</html>
