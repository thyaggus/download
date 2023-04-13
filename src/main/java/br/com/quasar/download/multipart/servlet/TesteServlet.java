package br.com.quasar.download.multipart.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Teatando o Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Estou Vivo hua-hahahahah</h1>");
        out.println("<p>Um simples teste com servlet</p>");
        out.println("</body></html>");
    }
}
