import java.util.Random;
import java.util.Scanner;

public class DevinezLeNombre {
    public static void main(String[] args) {
        Random r = new Random();
        int essai = 0;
        int justePrix = r.nextInt(100);
        int prix = 0;

        
        
        while (justePrix != prix) {
            System.out.println("Entrez un numero entre 1 et 100");
            Scanner scan = new Scanner(System.in);
            
           if (essai > 0 ) {
            if (justePrix > prix) {
                System.out.println("C'est plus!");
            } else {
                System.out.println("C'est moins");
            }
            
           } 
           
            prix = scan.nextInt();
            essai++;
        }

        System.out.println("Bravo Le juste juste prix est : " + justePrix);
        System.out.println("En " + essai + " essais");
   
    }
}
