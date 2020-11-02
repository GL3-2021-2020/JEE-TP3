package web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@WebServlet(name = "cs", urlPatterns = { "/" })
public class ControleurServlet extends HttpServlet {
    private static final long serialVersionUID = 1825023232864573043L;

    public static ProduitModele modele = new ProduitModele();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String motCle = req.getParameter("motcle");
        CatalogueImpl metier = new CatalogueImpl();
        List<Produit> prods = metier.getProduitsParMotCle(motCle);
        modele.setMotCle(motCle);
        modele.setProduits(prods);
        req.setAttribute("modele", modele);
        req.setAttribute("arr", modele.produits);

        RequestDispatcher rd = req.getRequestDispatcher("ProduitsView.jsp");
        rd.forward(req, resp);
    }
}
