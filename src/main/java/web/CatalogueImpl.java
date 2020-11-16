package web;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogueImpl implements ICatalogue {

    public List<Produit> getProduitsParMotCle(String mc) {
        List<Produit> prods = new ArrayList<Produit>();
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from produits where NOM_PRODUIT LIKE ?");
            ps.setString(1, "%" + mc + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Produit p = new Produit();
                p.setIdProduit(rs.getLong("ID_PRODUIT"));
                p.setNomProduit(rs.getString("NOM_PRODUIT"));
                p.setPrix(rs.getDouble("PRIX"));
                p.setQuantity(rs.getInt("QUANTITY"));
                prods.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prods;
    }

    @Override
    public void addProduit(Produit p) {
        Connection connection = SingletonConnection.getConnection();
        try {
            String nomProduit = p.nomProduit;
            String query = "INSERT INTO produits(NOM_PRODUIT,PRIX,quantity) VALUES (" + nomProduit + "," + p.prix + ","
                    + p.quantity + ");";
            System.out.println(query);
            PreparedStatement ps = connection.prepareStatement(query);
            int resultSet = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProduit(Integer id) {
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("delete from produits where ID_PRODUIT = ?");
            ps.setInt(1, id);
            Integer res = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
