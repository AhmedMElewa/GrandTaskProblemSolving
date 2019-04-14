
package grandps;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Ahmed M Elewa
 */
public class GrandPS {

    
    public static void main(String[] args) {
        int n = validateNumber();
        
        while(bigNounDivisor(n)!=0){
          n -= bigNounDivisor(n);
        }
        System.out.println(n);
    }
    
    // return int big non divisor smaller than n
    public static int bigNounDivisor(int a){
        boolean found = false;
        int n = a;
        a--;
        while(!found && a!=0){
          if(n%a!=0) return a;
          a--;
        }
        return 0;
    }
    
    //validate if entered is a valider number 0<n<1000000000 
     private static int validateNumber() {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Please enter a positive number where 0 < n < 1000000000 : ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            number = scanner.nextInt();
        } while (number < 1 || number >1000000000);

        return number;
    }
    
}
