<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>demo</title>
</head>
<body>
    <c:forEach items="${list}" var="stu">
        <h1>${stu.id}</h1>
        <h1>${stu.name}</h1>
    </c:forEach>
</body>
</html>