/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Input = new Scanner(System.in);


        //Input the # of minutes
        System.out.println("Please input the number of minutes your car has parked:");
        int min = Input.nextInt();
        
        //output parking time in minutes
        System.out.printf("%-30s: %d\n","Parking time (minutes)",min);
        
        if (min <= 60){
            
            int hour = 1;
            System.out.printf("%-30s: %d\n","Parking time (hours)", hour);
            //price per hour
            double price = 2;
            System.out.printf("%-30s: %.2f\n","Price",price);
        
        }    else if (min > 60){
            
            //how many hours was the car parked 
            int min_To_Hours = min/60;
            int pHours = min_To_Hours+1;
            //Output Parking time (hours)
            System.out.printf("%-30s: %d\n","Parking time (hours)",pHours);
            //Price per hour
            double price = pHours * 2;
            //Output Price
            System.out.printf("%-30s: %.2f\n","Price",price);
   
        }
        
    
    }
    
}
