/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2td0;
import java.util.Scanner;
/**
 *
 * @author lucas.revault_arondo
 */
public class Exo2Td0 {

    /**
 * Nom : Revault
 * Prénom : Lucas
 * Groupe :
 * Exercice : Exo2 - Addition d'entiers
 */
     
    public static void main(String[] args) {
     int nb;
     int result;
     int ind;
     Scanner sc=new Scanner(System.in);
     System.out.println("Veuillez entrer un nombre\n");
     nb=sc.nextInt();
     result=0;
     
     ind=1;
     while(ind<=nb){
         result=result+ind;
         ind++;
     }
     
     System.out.println(" La somme des " + nb +" entiers est " + result);
    }
    
}
