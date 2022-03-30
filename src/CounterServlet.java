import java.annotation.Webservlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.IOExeption;

@WebServelet(name = "CounterServlet", urlPatterns = "/counter")

public class CounterServlet extends HttpServlet {


    protected void deGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       if(request.getParameter("reset") != null && request.getParemeter("reset").equalsIgnoreCase("reset")) {
           counter = 0;
       }

        counter++;


        response.getWriter().println("<h1>The count currently is " + counter "on this load.</h1>");

}

}
