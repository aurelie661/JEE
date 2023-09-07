<%@ page import="java.time.LocalDate" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <%@ include file="/bootstrapImports.html" %>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<ul>

  <li><a href="add">Mon d'ajout "Cat"</a></li>
  <li><a href="monServlet-html">Mon servlet html</a></li>
  <li><a href="monServlet">Mon servlet</a></li>
    <b> Date du jour : </b> <%= LocalDate.now() %>

  <% for (int i = 0; i < 5; i++) {%>
  <li>Item N° <%=i %></li>
  <% }%>
</ul>

</body>
</html>