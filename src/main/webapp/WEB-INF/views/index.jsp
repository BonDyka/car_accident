<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="main">
    <div class="container">
        <table>
            <thead>
            <tr>
                <th width="80">ID</th>
                <th width="160">Accident Name</th>
                <th width="180">Accident Description</th>
                <th width="120">Accident Address</th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${!empty listAccident}">
                <c:forEach items="${listAccident}" var="accident">
                    <tr>
                        <td>${accident.id}</td>
                        <td>${accident.name}</td>
                        <td>${accident.text}</td>
                        <td>${accident.address}</td>
                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
