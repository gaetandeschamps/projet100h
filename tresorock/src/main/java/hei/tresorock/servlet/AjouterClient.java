package hei.tresorock.servlet;

        import hei.tresorock.entities.Client;
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
        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.time.format.DateTimeParseException;
        import java.util.List;

@WebServlet("/nouveauClient")
public class AjouterClient extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(req.getServletContext());
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");

        WebContext context = new WebContext(req, resp, req.getServletContext());

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        templateEngine.process("TEA", context, resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //on récupère le(s) paramètre(s) mis dans le form
        String nomClient = req.getParameter("nomClient");
        String prenomClient = req.getParameter("prenomClient");
        String ecoleClient = req.getParameter("ecoleClient");
        Boolean cotisantClient = Boolean.parseBoolean(req.getParameter("cotisantClient"));
        String statutClient = req.getParameter("statutClient");

        try{
            Client newClient = new Client(null,nomClient,prenomClient,ecoleClient,cotisantClient,statutClient);
            ListeSoiree.getInstance().addClient(newClient);
        } catch (NumberFormatException | DateTimeParseException ignored) {

        }
        //création d'un nouveau client
        Client newClient = new Client(null, nomClient, prenomClient, ecoleClient, cotisantClient, statutClient);
        try {
           ListeSoiree.getInstance().addClient(newClient);
        }catch (IllegalArgumentException e){
            resp.sendRedirect("error");
            return;
        }
        //redirection page préc.
        resp.sendRedirect(("TEA"));
    }
}
