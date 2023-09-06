<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/09/2023
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/bootstrapImports.html"%>
    <title>Exo Tableau</title>
    <td>
        <% for (List<Objects> pre : people) { %>
        <tr><%= pre %></tr>
        <% } %>
    </td>
</head>
<body>

</body>
</html>
