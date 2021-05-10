<%--
  Created by IntelliJ IDEA.
  User: msik
  Date: 2021/4/3
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="list">
</form>
    <table border="1">
        <tr>
            <td colspan="4">考勤记录信息表</td>
        </tr>
        <tr>
            <td>员工姓名</td>
            <td>所属部门</td>
            <td>考勤日期</td>
            <td>考勤状态</td>
        </tr>
        <c:forEach items="${attenceList}" var="a">
            <tr>
                <td>${a.empname}</td>
                <td>${a.dept}</td>
                <td><fmt:formatDate value="${a.chkdate}"/></td>
                <td>${a.statusName}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="${pageContext.request.contextPath }/toadd"><button>考勤登记</button></a>

</body>
</html>
