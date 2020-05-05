<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Car Accident</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="bg-secondary h-100">
    <div class="header">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Car Accident</a>
        </nav>
    </div>
    <div class="row h-25"></div>
    <div class="row">
        <div class="bg-dark text-center text-white mx-auto mt-5 p-3 w-25 h-50">
            <h2 class="p-2">Login</h2>
            <form:form action="login" method="post">
                <div class="input-group mb-3 w-75 mx-auto">
                    <input type="text" name="username" class="form-control" placeholder="Username">
                </div>
                <div class="input-group mb-3 w-75 mx-auto">
                    <input type="password" name="password" class="form-control" placeholder="Password">
                </div>
                <div class="input-group mb-3 w-75 mx-auto">
                    <input type="submit" value="Sign In" class="form-control btn btn-primary" placeholder="Password">
                </div>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
