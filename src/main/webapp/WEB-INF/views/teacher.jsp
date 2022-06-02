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
    <title>Teacher</title>
</head>
<body>
<div class="container">
    <h3>${title}</h3>
    <c:if test="${not view2}">
        <div class="options">
            <form action="<c:url value="/teachers" />" method="get" class="flex">
                <!-- <div class="flex"> -->
                <fieldset class="majors-select">
                    <legend>Major</legend>
                    <div>
                        <input type="checkbox" id="CNTT" name="majors" value="CNTT"/>
                        <label for="CNTT">CNTT</label>
                    </div>
                    <div>
                        <input type="checkbox" id="DTVT" name="majors" value="DTVT"/>
                        <label for="DTVT">DTVT</label>
                    </div>
                </fieldset>
                <fieldset class="quantity-select">
                    <legend>Number of student instructed:</legend>
                    <div>
                        <label for="quantity">Quantity</label>
                        <input type="number" id="quantity" min="0" name="quantity" value="" />
                    </div>
                </fieldset>
                <!-- </div> -->
                <div>
                    <input type="submit" value="Submit" class="mt-2 ml-1"/>
                </div>
            </form>
        </div>
    </c:if>
    <table class="teachers">
        <thead>
            <tr>
                <th>No</th>
                <th>Code</th>
                <th>Name</th>
                <th>Major</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="teacher" items="${teachers}" varStatus="loop">
                <tr>
                    <td>${loop.count}</td>
                    <td>${teacher.code}</td>
                    <td>${teacher.name}</td>
                    <td>${ view2 ? teacher.majorName : teacher.major.name }</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<%--<script src="<c:url value="/resources/js/teacher.js" />"></script>--%>
</body>
</html>