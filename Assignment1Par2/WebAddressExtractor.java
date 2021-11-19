/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaddressextractor;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class WebAddressExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner Input =new Scanner(System.in);
        
        //input the address
        System.out.println("Please input a web address: ");
        String website = Input.nextLine().toLowerCase();
        //output the address
  	System.out.printf("%-10s: %s\n", "Address",website);
        
        //identify the two dots in the web address
        int dotPoint1 = website.indexOf('.');
        int dotPoint2 = website.lastIndexOf('.');
	
        String heading = website.substring(0,dotPoint1);                //selecting the heading, the first letter to the first point in the address (not including the point) 
        String company = website.substring(dotPoint1 +1, dotPoint2);    //selecting the company, everything that is between the first point and the last point
        String extension = website.substring(dotPoint2 + 1);            //selecting the extension, everything that comes after the last point
        
        //output the heading
        System.out.printf("%-10s: %s\n" , "Heading", heading);
        //output the comapany name
        System.out.printf("%-10s: %s\n" , "Company", company);
        //output the extension
        System.out.printf("%-10s: %s\n" , "Extension", extension);
        
        
    }
    
}
