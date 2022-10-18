package fr.dampierre;

import java.util.Scanner;
public class SalaireQuotaPrime {

    public static void main(String[] args) {
        int salaire = 400;
        int quota = 10;
        int prime = 250;
        //bshbs
     
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le nombre de vente de la semaine : ");
        int nbVentes = clavier.nextInt();
     
        if (nbVentes >= quota) {
        //ajouter la prime
        salaire = salaire + prime;
        System.out.println("Félicitations! Vous avez rempli le quota.");
        } else {
        int nbManquantes = quota - nbVentes;
        System.out.print("Il vous manque " + nbManquantes + " ventes. ");
        System.out.println(" pour atteindre le quota ");
        }
     
        System.out.println("Votre salaire est de : " + salaire + " euros");
        }
       
}
