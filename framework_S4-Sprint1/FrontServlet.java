package etu1927.framework.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class FrontServlet extends HttpServlet{

    public void init() throws ServletException {
        System.out.println("FrontServlet: init");
    }

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<!DOCTYPE html><html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<meta charset=\"UTF-8\" />");
        response.getWriter().println("<title>FrontServlet</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body bgcolor=\"white\">");
        response.getWriter().println("<h1>FrontServlet</h1>");
        response.getWriter().println("<p>FrontServlet</p>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
    
    @Override 
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
        throws IOException, ServletException
    {
        doGet(request, response);
    }
}