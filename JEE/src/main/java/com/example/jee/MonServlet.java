package com.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// Pour créer un Servlet, il faut que la classe hérite de HttpServlet
// et possède l'annotation @WebServlet
@WebServlet(name = "monServlet", value = "/monServlet")
public class MonServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Mon servlet est lancé");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Une requête GET a été envoyée à /monServlet");

        // Sélection du type de contenu (plain, http, json...)
        resp.setContentType("text/plain");

        // Création d'un Writer pour "écrire" la page
        PrintWriter out = resp.getWriter();

        // Envoi de lignes de texte
        out.println("La réponse du Servlet \"monServlet\"");
    }
    @Override
    public void destroy() {
        System.out.println("monServlet est détruit !");
    }
}
