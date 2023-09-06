package com.example.jee.exo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "monServletTab", value = "/monServletTab")
public class MonServletTab extends HttpServlet {
    List<Object> people = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("people", people);
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
    }
}
