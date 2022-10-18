package fr.dampierre;

import java.util.Scanner;
public class SecondeDepuisMinuit2 {

    public static void main(String[] args) {
   int heures = 12;
   int minutes = 34;
   int secondes = 56;

   int nbSecondesDepuisMinuit = heures * 60 * 60 + minutes * 60 + secondes;

   System.out.println("Le nombre de secondes passées depuis minuit est : " +
   nbSecondesDepuisMinuit);
   }
}