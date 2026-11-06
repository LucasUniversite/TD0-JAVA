/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package td1;

/**
 *
 * @author lucas.revault_arondo
 */
public class Personne {
    
    private int aneNaissance;
    private String nom;
    private String prenom;
    private static int Nb=0;
    
    public Personne(int annee,String n,String p){
        this.aneNaissance=annee;
        this.nom=n;
        this.prenom=p;
        Nb++;
        AfficherNbPersonne();
    }
    
    public Personne(int annee,String p){
        this.nom="inconnu";
        this.aneNaissance=annee;
        this.prenom=p;
        Nb++;
        AfficherNbPersonne();
    }
    
    public Personne(){
        this(1980,"Potter","Harry");
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAneNaissance() {
        return aneNaissance;
    }

    public void setAneNaissance(int aneNaissance) {
        this.aneNaissance = aneNaissance;
    }
    
    public void setPrenom(String p){
        this.prenom=p;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int CalculerAge(){
        return 2026 - this.aneNaissance;
    }

    public void AfficherInfo(){
        System.err.println(" Nom : " + nom );
        System.err.println(" Prenom : " + prenom );
        System.err.println(" Age : " + CalculerAge());
    }
    
    public void mange(String A){
        System.err.println( nom + prenom + " mange un " + A);
    }
    
    public static void AfficherNbPersonne(){
        System.err.println(" Le nombre de personne est de : " + Nb );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    // Création des 3 personnes avec les 3 constructeurs
    Personne p1 = new Personne(2004, "Dupont", "Jean");
    Personne p2 = new Personne(2005, "Ousska");
    Personne p3 = new Personne();


    System.out.println("Nom : " + p1.getNom());
    System.out.println("Prenom : " + p1.getPrenom());
    System.out.println("Annee de naissance : " + p1.getAneNaissance());

    p1.setNom("Lucas");
    p1.setPrenom("Revault");
    p1.setAneNaissance(2005);

    System.out.println("Age : " + p1.CalculerAge());

    p1.mange("Attieke");

    p1.AfficherInfo();


  
    System.out.println("Nom : " + p2.getNom());
    System.out.println("Prenom : " + p2.getPrenom());
    System.out.println("Annee de naissance : " + p2.getAneNaissance());

    p2.setNom("Martin");
    p2.setPrenom("Paul");
    p2.setAneNaissance(2003);

    System.out.println("Age : " + p2.CalculerAge());

    p2.mange("Pizza");

    p2.AfficherInfo();


   

    System.out.println("Nom : " + p3.getNom());
    System.out.println("Prenom : " + p3.getPrenom());
    System.out.println("Annee de naissance : " + p3.getAneNaissance());

    p3.setNom("Potter");
    p3.setPrenom("Harry");
    p3.setAneNaissance(1980);

    System.out.println("Age : " + p3.CalculerAge());

    p3.mange("Sandwich");

    p3.AfficherInfo();
       
    }
    
}
