package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Aster
 */
public class NoteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NoteServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NoteServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title = br.readLine();
        String content = br.readLine();
        Note note = new Note(title, content);
        request.setAttribute("note", note);
        request.setAttribute("title", note.getTitle());
        request.setAttribute("content", note.getContent());
        String edit = request.getParameter("request");//This checks if the edit button has been clicked 
        if (edit != null && edit.isEmpty()) { //If the edit parameter is active, the edit note page should be displayed
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);
        } else { //Otherwise, the view note page is displayed
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

            String title = request.getParameter("title");
            String content = request.getParameter("content");
            Note note = new Note(title, content);
            pw.write(note.getTitle());
            pw.write(note.getContent());//These lines write the new information to the file
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp") //redirects back to the main page
                    .forward(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
