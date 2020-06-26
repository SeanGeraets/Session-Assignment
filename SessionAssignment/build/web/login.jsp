<%-- 
    Document   : login
    Created on : Feb 20, 2020, 6:13:26 PM
    Author     : Sean Geraets
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String currentPageMessage 
            = (String) session.getAttribute("currentPageMessage");
    if(null == currentPageMessage){
        currentPageMessage = "Please enter your user name and password.";
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="css/standard.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <nav>
                <a href="index.jsp">Home</a>
            </nav>
            <h1>Login</h1>
        </header>
        <section>
            <h2><%= currentPageMessage %></h2>
            <form action="LoginHandler" method="POST" >

                <label for="userName">User Name</label><br />
                <input type="text" name="userName" /><br />

                <label for="password">Password</label><br />
                <input type="password" name="password" /><br />

                <input type="submit" value="Login" />
            </form>
        </section>
    </body>
</html>
