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
public class Panier {
      private ArrayList<produit> produits;

    public Panier() {
        produits = new ArrayList<>();
    }
    
    public void ajtProduit(produit p){
        produits.add(p);
    }
    
    public void suppProduit(produit p){
          produits.remove(p);
    }
    
    public void afficherPanier(){
        for(produit prod: produits){
            prod.AfficherDetails();
            System.err.println();
        }
    }
        
      
    public double CalculeTotal(){
         double total=0;
        for (produit prod : produits){
            total=total+prod.getPrix();
        }
        return total;
    }    
    
    public ArrayList<produit> getPanier(){
        return produits;
    }
}


