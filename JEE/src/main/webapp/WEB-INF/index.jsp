<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/09/2023
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="personList" type="java.util.ArrayList<com.example.jee.exo.model.Person>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <%@include file="/bootstrapImports.html"%>
        <h1 class="text-center text-dark">Exo Tableau</h1>
        <div class="row my-3">
            <div class="col-8 offset-2 text-bg-dark rounded p-3">
                <table class="table table-dark table-hover align-middle">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">First Name</th>
                            <th scope="col">Last Name</th>
                            <th scope="col">Age</th>
                            <th scope="col">Actions</th>
                        </tr>
                    </thead>
                    <tbody>

                            <% for (int i = 1; i < personList.size(); i++) {%>
                        <tr>
                                <td><%= i %></td>
                                <td><%= personList.get(i).getFirstname() %></td>
                                <td><%= personList.get(i).getLastname() %></td>
                                <td><%= personList.get(i).getAge() %></td>
                                <td>
                                    <a href="#"><button type="button" class="btn btn-outline-info">Details</button></a>
                                </td>
                        </tr>
                            <% } %>

                    </tbody>
                </table>
            </div>
        </div>
        <title></title>
    </head>
<body>

</body>
</html>
