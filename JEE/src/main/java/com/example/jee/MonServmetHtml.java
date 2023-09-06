package com.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "monServletHtml", value = "/monServlet-html")
public class MonServmetHtml extends HttpServlet {
    private String firstName;

    public void init() throws ServletException{
        firstName = "Aurélie";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<p> Le prénom de la personne est <b>" + firstName +"</b></p>");
    }

}
