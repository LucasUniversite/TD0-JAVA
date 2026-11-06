/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td1.GestionMagasin;

/**
 *
 * @author lucas.revault_arondo
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Magasin magasin = new Magasin();
        Panier panier = new Panier();

        Client client = new Client(1, "Lucas", "lucas@gmail.com");

        produit p1 = new produit(1, "Clavier", 39.99f, 10);
        produit p2 = new produit(2, "Souris", 19.99f, 15);
        produit p3 = new produit(3, "Ecran", 149.99f, 5);

        magasin.ajtProduit(p1);
        magasin.ajtProduit(p2);
        magasin.ajtProduit(p3);

        int choix = 0;

        while (choix != 5) {

            System.out.println("--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");

            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {

                case 1:
                    magasin.AfficherProdDispoMaga();
                    break;

                case 2:
                    System.out.print("Nom du produit : ");
                    String nomProduit = sc.nextLine();

                    produit prod = magasin.ProduitEgalAuNom(nomProduit);

                    if (prod != null) {
                        panier.ajtProduit(prod);
                        System.out.println("Produit ajoute au panier.");
                    } else {
                        System.out.println("Produit introuvable.");
                    }

                    break;

                case 3:
                    panier.afficherPanier();
                    System.out.println("Total : " + panier.CalculeTotal() + " euros");
                    break;

                case 4:
                    if (panier.getPanier().isEmpty()) {
                        System.out.println("Le panier est vide.");
                    } else {
                        Commande commande =
                                new Commande(1, client, panier.getPanier());

                        commande.AfficherDetailCommande();
                    }
                    break;

                case 5:
                    System.out.println("Au revoir.");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        }

        sc.close();
    }
}