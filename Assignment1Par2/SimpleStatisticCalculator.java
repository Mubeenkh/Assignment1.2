/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplestatisticcalculator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SimpleStatisticCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Input =new Scanner(System.in);
       System.out.println("Please input 5 numbers separated by space: ");
        String numbers = Input.nextLine(); 
        //ex:5 7 8 9 4
        
        //   0123456789
    //number1
        String num1 = numbers.substring(0,1);
        int newNum1 = Integer.parseInt(num1);        
    //number2
        String num2 = numbers.substring(2,3);
        int newNum2 = Integer.parseInt(num2);
    //number3
        String num3 = numbers.substring(4,5);
        int newNum3 = Integer.parseInt(num3);
    //number4
        String num4 = numbers.substring(6,7);
        int newNum4 = Integer.parseInt(num4);
    //number5
        String num5 = numbers.substring(8,9);
        int newNum5 = Integer.parseInt(num5);
    //output the Numbers
        System.out.printf("%-10s: %.2f %.2f %.2f %.2f %.2f\n" ,"Numbers",(double)newNum1,(double)newNum2,(double)newNum3,(double)newNum4,(double)newNum5);
        
    //Finding the mean
        double mean = (double)(newNum1 + newNum2 + newNum3 + newNum4 + newNum5)/5;
        System.out.printf("%-10s: %.2f\n" ,"Mean",mean);
        
    //Finding the smallest number
        if(newNum1 < newNum2 && newNum1 < newNum3 && newNum1 < newNum4 && newNum1 < newNum5){
            System.out.printf("%-10s: %.2f\n","Minimun", (double)newNum1);
        }
        if(newNum2 < newNum1 && newNum2 < newNum3 && newNum2 < newNum4 && newNum2 < newNum5){
            System.out.printf("%-10s: %.2f\n","Minimun",(double)newNum2);
        }
        if(newNum3 < newNum1 && newNum3 < newNum2 && newNum3 < newNum4 && newNum3 < newNum5){
            System.out.printf("%-10s: %.2f\n","Minimun",(double)newNum3);
        }
        if(newNum4 < newNum1 && newNum4 < newNum2 && newNum4 < newNum3 && newNum4 < newNum5){
            System.out.printf("%-10s: %.2f\n","Minimun",(double)newNum4);
        }
        if(newNum5 < newNum1 && newNum5 < newNum2 && newNum5 < newNum3 && newNum5 < newNum4){
            System.out.printf("%-10s: %.2f\n","Minimun",(double)newNum5);
        }
        
    //Finding the biggest number
        if(newNum1 > newNum2 && newNum1 > newNum3 && newNum1 > newNum4 && newNum1 > newNum5){
            System.out.printf("%-10s: %.2f\n","Maximun",(double)newNum1);
        }
        if(newNum2 > newNum1 && newNum2 > newNum3 && newNum2 > newNum4 && newNum2 > newNum5){
            System.out.printf("%-10s: %.2f\n","Maximun",(double)newNum2);
        }
        if(newNum3 > newNum1 && newNum3 > newNum2 && newNum3 > newNum4 && newNum3 > newNum5){
            System.out.printf("%-10s: %.2f\n","Maximun",(double)newNum3);
        }
        if(newNum4 > newNum1 && newNum4 > newNum2 && newNum4 > newNum3 && newNum3 > newNum5){
            System.out.printf("%-10s: %.2f\n","Maximun",(double)newNum4);
        }
        if(newNum5 > newNum1 && newNum5 > newNum2 && newNum5 > newNum3 && newNum5 > newNum4){
            System.out.printf("%-10s: %.2f\n","Maximun",(double)newNum5);
        }
        
    //Standard Deviation
 	//finding |x-mean|^2 where x is each number that was input
        double values1 = Math.pow(newNum1-mean,2);
        double values2 = Math.pow(newNum2-mean,2);
        double values3 = Math.pow(newNum3-mean,2);
        double values4 = Math.pow(newNum4-mean,2);
        double values5 = Math.pow(newNum5-mean,2);
        
        //sum of all values
        double sumValues = values1 + values2 + values3 + values4 + values5;
        
        //dividing the Sum of all values by the number of values that were input (herewe input 5 values) 
        double divide_Sum_by_N = sumValues/5;
        
        //finding the standard deviation
        double Stad_Dev = Math.sqrt(divide_Sum_by_N);
        
        //output the standarddeviation
        System.out.printf("%-20s: %.2f\n","Standard Deviation",Stad_Dev);
        
        
    }
    
}
