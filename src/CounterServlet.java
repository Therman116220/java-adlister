import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRespose;
import java.IOExeption;

@WebServelet(name = "CounterServlet", urlPatterns = "/counter")

public class CounterServlet extends HttpServlet {
    public int counter = 0;

    protected void deGet(HttpServletRequest request, HttpServletResponse response) throwa IOException {
        counter++;

}

}
