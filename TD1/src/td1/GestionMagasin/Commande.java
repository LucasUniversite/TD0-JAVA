/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td1.GestionMagasin;
import java.util.ArrayList;

/**
 *
 * @author lucas.revault_arondo
 */
public class Commande {
    private int IdCommande;
    private Client Client;
    private ArrayList<produit> ProduitCommande;
    private double Total;
    
    
    public Commande(int id,Client c,ArrayList<produit> p){
        this.Client=c;
        this.IdCommande=id;
        this.ProduitCommande=p;
        
        for(produit prod:ProduitCommande){
            Total=Total+prod.getPrix();
        }
    }
    
    public void AfficherDetailCommande(){
        System.err.println(" l'identifiant est :  " + IdCommande);
        System.err.println(" le client est :  " + Client.getNom());
        for(produit prod:ProduitCommande){
            System.err.println(" le produit est : " + prod.getNom() + 
                    " et coute " + prod.getPrix() + " euros ");
        }
        System.err.println(" le total en euros est de  " + Total);
    
        
        System.err.println(" Le total est de " + Total + " euros " );
    }
    
    
    
    
}
