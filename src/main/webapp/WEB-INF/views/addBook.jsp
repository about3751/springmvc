<%--
  Created by IntelliJ IDEA.
  User: leich
  Date: 2017/3/26
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add New Person</title>
</head>
<body>

    <form:form action="book" method="post" modelAttribute="book">
            <h1>bookName:<from:input type="text" path="bookName"/></h1>
        <br/>
        <input type="submit" value="新增" />
    </form:form>

</body>
</html>
