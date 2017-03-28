<%--
  Created by IntelliJ IDEA.
  User: leich
  Date: 2017/3/26
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Modify Edit</title>
</head>
<body>

<form:form action="${pageContext.request.contextPath }/main/book" method="POST" modelAttribute="book">
    <c:if test="${book.id != null}">
        <form:hidden path="id"></form:hidden>
        <form:hidden path="addTime"></form:hidden>
        <input type="hidden" name="_method" value="PUT"/>
    </c:if>
    <c:if test="${book.id == null}">
        <form:input path="id"></form:input>
    </c:if>
    <h1>bookName: <input type="text" value="${book.bookName}" name="bookName"/></h1><br/>

    <input type="submit" value="更新"/>
</form:form>

<br/>
<h1>${pageContext.request.contextPath}/main/book</h1>
</body>
</html>
