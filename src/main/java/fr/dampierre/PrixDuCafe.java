package fr.dampierre;

import java.util.Scanner;

public class PrixDuCafe {
    public static void main(String[] args) {

        int prixCafé = 100;
     
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez votre argent : ");
        int nbCentimes = clavier.nextInt();
     
        if (nbCentimes == prixCafé) {
        System.out.println("Vous avez exactement de quoi vous payer le café!");
     
        } else if (nbCentimes < prixCafé) {
     
        int nbManquants = prixCafé - nbCentimes;
        System.out.print("Il vous manque " + nbManquants +" cents pour avoir un café.");
        }
        else {
        int nbRestants = nbCentimes - prixCafé;
        System.out.println("Il vous restera " + nbRestants + "cents après avoir pris votre café.");
     
        }
    
}
}
