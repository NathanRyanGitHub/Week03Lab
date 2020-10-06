
package servlets;

import domain.Note;
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

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String path = getServletContext().getRealPath("/WEB-INF/note.txt");
       String queryString = request.getQueryString();
       BufferedReader br = new BufferedReader(new FileReader(new File(path)));
       Note note = new Note();
       
       note.setTitle(br.readLine());
       note.setContents(br.readLine());
       br.close();
       
       if(queryString == null) {
            request.setAttribute("note", note);
            request.getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       }

       else if(queryString.equals("edit")) {
            request.getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
       }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String path = getServletContext().getRealPath("/WEB-INF/note.txt");
       String title = request.getParameter("title");
       String contents = request.getParameter("contents");
       PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
       
       pw.write(title);
       pw.write("\n");
       pw.write(contents);
       pw.close();
       
       BufferedReader br = new BufferedReader(new FileReader(new File(path)));
       Note note = new Note();
       note.setTitle(br.readLine());
       note.setContents(br.readLine());
       
       br.close();
       
       request.setAttribute("note", note);
       
       request.getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}
