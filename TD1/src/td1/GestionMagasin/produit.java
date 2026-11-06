/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td1.GestionMagasin;

/**
 *
 * @author lucas.revault_arondo
 */
public class produit {
    private int id;
    private String nom;
    private float prix;
    private int quantite;
    
    public produit(int id,String n,float p,int q){
        this.id=id;
        this.nom=n;
        this.prix=p;
        this.quantite=q;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    
    public void AfficherDetails(){
        System.err.println(" l'identifiant : " + id);
        System.err.println(" le nom : " + nom);
        System.err.println(" le prix : " + prix);
        System.err.println(" la quantite : " + quantite);
    }
    
  
}
