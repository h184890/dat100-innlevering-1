package no.hvl.dat100_2;


import java.util.Scanner;

public class O1 {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    
    for (int i = 1; i <= 10; i++) {
        int poengsum;

        
        while (true) {
           
            System.out.print("Skriv inn poengsummen til student " + i + " ");
            poengsum = scanner.nextInt();

           
            if (poengsum >= 0 && poengsum <= 100) {
                break; 
            } else {
                
                System.out.println("Ugyldig poengsum, prøv igjen");
            }
        }

       
        if (poengsum >= 90) {
            System.out.println("Karakter A");
        } else if (poengsum >= 80) {
            System.out.println("Karakter B");
        } else if (poengsum >= 60) {
            System.out.println("Karakter C");
        } else if (poengsum >= 50) {
            System.out.println("Karakter D");
        } else if (poengsum >= 40) {
            System.out.println("Karakter E");
        } else {
            System.out.println("Karakter F");
        }
    }
    
    scanner.close();
}
}
