
package primes;

import java.util.Scanner;

public class Primes {

    private static void primesInAnInterval(int from, int to){
        int i,j;
        boolean wrong;
        System.out.printf("%nThe primes in interval %d - %d are: [", from, to);
        for(i=from; i<=to; ++i){
            wrong = false;
            for(j=2; j<=(int)Math.sqrt(i); ++j) 
                if(i%j==0) {
                    wrong = true;
                    break;
                }
            if(!wrong) System.out.printf("%d, ",i);
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number of the interval: ");
        int from = input.nextInt();
        System.out.printf("%nEnter ending number of the interval: ");
        int to = input.nextInt();
        if (from > to){
            System.out.println("Invalid input! Ending number is less than the starting!");
        } else if (from <= 0 || to <= 0){
                    System.out.println("Invalid input! Negavite or zero number entered!");
                } else {
                    primesInAnInterval(from, to);
                }
    }
    
}
