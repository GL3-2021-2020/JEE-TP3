package web;

import java.io.Serializable;

public class Produit implements Serializable {

    private static final long serialVersionUID = 7931931861816543213L;
    /**
     *
     */
    public Long idProduit;
    public String nomProduit;
    public double prix;
    public int quantity;

    public Produit() {
        super();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Produit(String nomProduit, double prix, int quantity) {
        super();
        this.nomProduit = nomProduit;
        this.prix = prix;
        this.quantity = quantity;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

}