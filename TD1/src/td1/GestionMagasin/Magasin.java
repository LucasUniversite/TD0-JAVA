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
public class Magasin {
    private ArrayList<produit> prodDispoMaga;
    public Magasin(){
        prodDispoMaga=new ArrayList<>();
    }
    
    public void ajtProduit(produit p){
        prodDispoMaga.add(p);
    }
    
    public void AfficherProdDispoMaga(){
        System.err.println(" Nos produits disponibles en stocks sont : ");
        for(produit prod:prodDispoMaga){
            prod.AfficherDetails();
            System.err.println();
        }
    }
    
    public produit ProduitEgalAuNom(String n){
        for(produit p:prodDispoMaga){
            if(p.getNom().equals(n)){
                return p;
            }
        }
        return null;
    }
    
}
