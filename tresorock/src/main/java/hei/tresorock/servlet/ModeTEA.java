package hei.tresorock.servlet;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Classe permettant d'accéder à la partie TEA du site.
 * Ne nécessite aucune session privée au préalable.
 * @author gaetandeschamps, clementgeorjon
 */
@WebServlet("/TEA")
public class ModeTEA extends HttpServlet {
    /**
     * Méthode doGET qui permet d'afficher le template tea, lorsque le bon URL est actif.
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(req.getServletContext());
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");

        WebContext context = new WebContext(req,resp,req.getServletContext());

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        templateEngine.process("tea", context, resp.getWriter());
    }
}
