package hei.tresorock.servlet;

import hei.tresorock.entities.Client;
import hei.tresorock.entities.Soiree;
import hei.tresorock.managers.ListeSoiree;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Classe permettant d'accéder à la partie ADMIN du site en se connectant.
 * @author gaetandeschamps, clementgeorjon
 */
@WebServlet("/session/admin")
public class ModeAdmin extends HttpServlet {
    /**
     * Méthode doGET qui permet d'afficher le template admin, seulement si la connexion est active.
     * A savoir, un login et un mot de passe corrects et actifs entrés dans le formulaire et connexion et contrôlé par cette classe.
     * @see ConnexionServlet
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getSession().getAttribute("adminConnecte").equals("login")) {
            ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(req.getServletContext());
            templateResolver.setPrefix("/session/");
            templateResolver.setSuffix(".html");

            WebContext context = new WebContext(req, resp, req.getServletContext());

            TemplateEngine templateEngine = new TemplateEngine();
            templateEngine.setTemplateResolver(templateResolver);

            templateEngine.process("admin", context, resp.getWriter());

            String clientId = req.getParameter("idClient");
            Client clients = ListeSoiree.getInstance().getClient(Integer.parseInt(clientId));
            context.setVariable("listeClients", clients);
        }

    }
}
