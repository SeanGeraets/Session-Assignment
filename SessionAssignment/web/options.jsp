<%-- 
    Document   : options
    Created on : Feb 20, 2020, 6:16:26 PM
    Author     : Sean Geraets
--%>

<%@page import="edu.kirkwood.java.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // Try to get a Person object.
    Person person = (Person) session.getAttribute("person");
    if(null == person){
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page for <%= person.getFirstName() %></title>
        <link href="css/standard.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <nav>
                <a href="LogoutHandler" >Log out</a>
            </nav>
            <h1>Hello, <%= person.getFirstName() %></h1>
        </header>
        <section>
            <h2>User Details</h2>
            <p>Email: <%= person.getEmailAddress() %></p>
            <p>Facts: <%= person.getFacts() %></p>
        </section>
    </body>
</html>
