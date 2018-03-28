package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alexandre
 */
@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/hello"}
    )
public class AdminServlet extends HttpServlet {

    /**
     *
     * @param req request
     * @param resp response
     * @throws ServletException ServletException
     * @throws IOException IOException
     */
    @Override
    protected void doGet(final HttpServletRequest req,
                final HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.write("hello heroku".getBytes());
        out.flush();
        out.close();
    }
}
