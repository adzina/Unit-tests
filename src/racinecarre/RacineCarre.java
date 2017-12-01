
package racinecarre;

import java.util.Scanner;
/**
 *
 * @author Jake
 */
public class RacineCarre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the value you want ot process\n");  
        String val = scanner.next(); 
        Sqrt sqrt = new Sqrt();
        System.out.print("The square root of "+val+" is: "+sqrt.solveSQRT(Double.parseDouble(val))+"\n");
    }
}
