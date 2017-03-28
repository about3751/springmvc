<%--
  Created by IntelliJ IDEA.
  User: leich
  Date: 2017/3/26
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Book Lists</title>
    <!--
	SpringMVC 处理静态资源:
	1. 为什么会有这样的问题:
	优雅的 REST 风格的资源URL 不希望带 .html 或 .do 等后缀
	若将 DispatcherServlet 请求映射配置为 /,
	则 Spring MVC 将捕获 WEB 容器的所有请求, 包括静态资源的请求, SpringMVC 会将他们当成一个普通请求处理,
	因找不到对应处理器将导致错误。
	2. 解决: 在 SpringMVC 的配置文件中配置 mvc:default-servlet-handler
	3. PS !!!!!!!!!!!!! 此处要用Class选择器 用ID选择器不知为何原因报错
	 -->
    <script type="text/javascript" src="../../js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript">
        //        $(function () {
        //            $(".delete").click(function () {
        //                var href = $(this).attr("href");
        //                $("form").attr("action", href).submit();
        //                return false;
        //            });
        //        })
    </script>
</head>
<body>

<!-- 配合JQuery实现Delete请求 实际上为一个POST请求 -->
<form action="${pageContext.request.contextPath}/main/book" method="POST">
    <input type="hidden" name="_method" value="DELETE"/>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>书名</td>
            <td>加入时间</td>
            <td>编辑</td>
            <td>选择</td>
        </tr>
        <c:forEach items="${requestScope.books}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.bookName}</td>
                <td>${book.addTime}</td>
                <td><a href="${pageContext.request.contextPath}/main/book/${book.id}">修改</a></td>
                <td><input type="checkbox" name="id" value="${book.id}"/></td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <input type="submit" value="delete"/>
</form>
</body>
</html>
