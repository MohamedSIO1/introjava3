package fr.dampierre;


import java.util.Scanner;


public class SecondeDepuisMinuit {

public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    System.out.println("Entrez les heures : ");
    int heures = clavier.nextInt();
    System.out.println("Entrez les minutes : ");
    int minutes = clavier.nextInt();
    System.out.println("Entrez les secondes : ");
    int secondes = clavier.nextInt();
    clavier.close();
 
    int nbSecondesDepuisMinuit = heures * 60 * 60 + minutes * 60 + secondes;
 
    System.out.println("Le nombre de secondes passées depuis minuit est : " +
    nbSecondesDepuisMinuit);
    }
}