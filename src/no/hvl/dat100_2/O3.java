package no.hvl.dat100_2;

import java.util.Scanner;

public class O3 {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skriv inn et heltall n (n > 0): ");
        int n = scanner.nextInt();
        
        
        if (n <= 0) {
            System.out.println("Ugyldig input! n må være større enn 0.");
        } else {
            
            long fakultet = 1;
            
            for (int i = 1; i <= n; i++) {
                fakultet *= i;
            }
            
            System.out.println("Verdien av " + n + "! er " + fakultet);
        }
        
        scanner.close();
    }
}



