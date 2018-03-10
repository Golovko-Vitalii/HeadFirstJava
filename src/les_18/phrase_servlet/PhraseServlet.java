package les_18.phrase_servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PhraseServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String title = "PhraseOMatic has generated the following phrase.";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println("PhraseOmatic");
        out.println("</TITLE></HEAD></HTML>");
        out.println("<H1>"+title+"</H1>");
        out.println("<P>"+PhraseOMatic.makePhrase());
        out.println("<P><a href=\"PhraseServlet\">Create another phrase</a></p>");
        out.println("</BODY></HTML>");
        out.close();
    }
}
