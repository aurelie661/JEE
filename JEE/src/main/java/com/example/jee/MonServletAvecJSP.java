package com.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "monServletAvecJSP", value = "/monservlet-jsp")
public class MonServletAvecJSP extends HttpServlet {

    private String firstName;
    private List<String> firstNames;
    @Override
    public void init() throws ServletException {
        firstName = "Johnny";

        firstNames = new ArrayList<>();
        firstNames.add("Jack");
        firstNames.add("Sully");
        firstNames.add("Chloée");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("blabla", firstName);
        req.setAttribute("prenomB", firstName);
        req.setAttribute("prenoms", firstNames);

        getServletContext().getRequestDispatcher("/test-01.jsp").forward(req, resp);
    }
}
