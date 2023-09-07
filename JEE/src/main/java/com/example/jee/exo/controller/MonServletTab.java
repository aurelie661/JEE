package com.example.jee.exo.controller;

import com.example.jee.exo.model.Person;
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
    List<Person> personList;

    @Override
    public void init() throws ServletException {
        personList = new ArrayList<>();
        personList.add(new Person("Aurélie","Boutillier",39));
        personList.add(new Person("Frederic","Boutillier",39));
        personList.add(new Person("Michael","Boutillier",39));
        personList.add(new Person("Océane","Boutillier",39));
        personList.add(new Person("Saliha","Boutillier",39));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("personList", personList);
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
    }
}
