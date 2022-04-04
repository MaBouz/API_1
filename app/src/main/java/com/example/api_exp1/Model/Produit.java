package com.example.api_exp1.Model;



public class Produit {

    private String nomProduit;
    private double prixProduit;
    public Produit(String nomProduit,double prixProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit=  prixProduit;
    }
    public String getNomProduit() {
        return nomProduit;
    }

    public double getPrixProduit(){return  prixProduit;}
}
