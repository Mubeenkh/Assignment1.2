/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BirthYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Input =new Scanner(System.in);
        
        //Input Year as a string
        System.out.println("Please input a birth year: ");
        String bYear = Input.nextLine();
        //output year
        System.out.printf("%-20s: %s\n", "Birth Year", bYear);    
        
        //selecting the century
        String cent = bYear.substring(0,2);          //select the two first "letters" of the bYear string
        int newCent = Integer.parseInt(cent)+1;      //turning it into an int and adding 1 
        //outputing the century
        System.out.printf("%-20s: %d\n", "Century", newCent);
        
        //selecting the decade
        String dec = bYear.substring(2,3)+0; //selects the third "letter' ofthe bYear string and add a 0 at the end
        int newDec = Integer.parseInt(dec);  //turning it into an int 
        //output decade
        System.out.printf("%-20s: %d\n", "Decade", newDec);
    }
    
}
