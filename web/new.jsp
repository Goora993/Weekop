<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Weekop - dodaj nowe treści</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" type="text/css" rel="stylesheet">
</head>
<body>

<nav class = "navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <a href="index.jsp" class="navbar-brand">Weekop</a>

        <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
            <span class="glyphicon glyphicon-list"></span>
        </button>

        <div class="collapse navbar-collapse navHeaderCollapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="index.jsp">Główna</a></li>
                <li><a href="new.jsp">Dodaj</a></li>
                <li><a href="login.jsp">Zaloguj się</a></li>
                <li><a href="register.jsp">Zarejestruj się</a></li>
            </ul>
        </div>

    </div>
</nav>

<div class="container">
    <div class="col-md-8 col-md-offset-2">
        <form class="form-signin" method="post" action="new">
            <h2 class="form-signin-heading">Dodaj nowe znalezisko</h2>
            <input name="inputName" type="text" class="form-control" placeholder="Co dodajesz?"
                   required autofocus>
            <input name="inputUrl" type="url" class="form-control" placeholder="URL"
                   required autofocus>
            <textarea name="inputDescription" rows="5" class="form-control" placeholder="Opis"
                      required autofocus></textarea>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Dodaj znalezisko!</button>
        </form>
    </div>
</div>

<footer class="footer">
    <div class="container">
        <p class="navbar-text">Weekop - developed by Goora 2020</p>
    </div>
</footer>

<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>