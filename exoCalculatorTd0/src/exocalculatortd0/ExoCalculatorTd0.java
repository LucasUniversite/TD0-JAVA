/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exocalculatortd0;
import java.util.Scanner;
/**
 *
 * @author lucas.revault_arondo
 */
public class ExoCalculatorTd0 {

       /**
 * Nom : Revault
 * Prénom : Lucas
 * Groupe :
 * Exercice : Exo2 - Addition d'entiers
 */
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter the operator:\n"
            + "1) add\n"
            + "2) substract\n"
            + "3) multiply\n"
            + "4) divide\n"
            + "5) modulo");

    int operator = sc.nextInt();
    if(operator<1 || operator>5){
        System.out.println(" operateur "+ operator +" n'est pas faisable ");
        return;
    }
    
    System.out.println(" Le premier nombre silvousplait : \n");
    int operande1=sc.nextInt();
    System.out.println(" Le deuxieme nombre silvousplait : \n");
    int operande2=sc.nextInt();
    int res;
     switch (operator) {

    case 1 -> {
        res = operande1 + operande2;
        System.out.println("Le résultat est : " + res);
    }

    case 2 -> {
        res = operande1 - operande2;
        System.out.println("Le résultat est : " + res);
    }

    case 3 -> {
        res = operande1 * operande2;
        System.out.println("Le résultat est : " + res);
    }

    case 4 -> {
        res = operande1 / operande2;
        System.out.println("Le résultat est : " + res);
    }

    case 5 -> {
        res = operande1 % operande2;
        System.out.println("Le résultat est : " + res);
    }

    default -> {
        System.out.println("Erreur : opérateur invalide");
    }
}
    
    
}
   
}