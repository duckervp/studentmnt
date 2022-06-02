<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="common/taglib.jsp" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="<c:url value="/resources/teacher.css" />">
    <title>Result</title>
</head>
<body>
<div class="container">
    <h3>${title}</h3>
    <table class="teachers">
        <thead>
        <tr>
            <th>No</th>
            <c:forEach var="head" items="${heads}">
                <th>${head}</th>
            </c:forEach>
<%--            <th>Code</th>--%>
<%--            <th>Name</th>--%>
<%--            <th>Major</th>--%>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="model" items="${datas}" varStatus="loop">
            <tr>
                <td>${loop.count}</td>
                <c:forEach var="data" items="${model}">
                    <td>${data}</td>
                </c:forEach>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>