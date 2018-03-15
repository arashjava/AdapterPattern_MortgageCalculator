/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myadapter;

import java.text.DecimalFormat;
import java.util.Scanner;
import myadapter.com.mortgagecalc.MortgagePaymentCalculator;

/**
 *
 * @author arash
 */
public class MyAdapter {


    /**
     * @param args the command line arguments
     */
        /*
        
         public static void main(String[] args) {
       
      // Scanner is a great class for getting 
      // console input from the user
       
      Scanner scanner = new Scanner(System.in);
 
      // Prompt user for details of loan
       
      System.out.print("Enter loan amount: ");
      int loanAmount = scanner.nextInt();
       
      System.out.print("Enter loan term (in years): ");
      int termInYears = scanner.nextInt();
       
      System.out.print("Enter interest rate: ");
      double interestRate = scanner.nextDouble();
       
      // Display details of loan
       
      double monthlyPayment = 
         calculateMonthlyPayment(loanAmount, termInYears, interestRate);
       
 
      // NumberFormat is useful for formatting numbers
      // In our case we'll use it for 
      // formatting currency and percentage values
       
      NumberFormat currencyFormat = 
         NumberFormat.getCurrencyInstance();
      NumberFormat interestFormat = 
         NumberFormat.getPercentInstance();
 
      // Display details of the loan
 
      System.out.println("Loan Amount: "+
         currencyFormat.format(loanAmount));
      System.out.println("Loan Term: "+
         termInYears+" years");
      System.out.println("Interest Rate: "+
         interestFormat.format(interestRate));
      System.out.println("Monthly Payment: "+
         currencyFormat.format(monthlyPayment));
 
   }
        
        
        */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Please enter size(sqf) of the property:");
        int sqf= sc.nextInt();

        System.out.println("Please enter price($) per sqf:");
        double ppsqf= sc.nextDouble();
        
        House house = new House(sqf, ppsqf);
        double housePrice= house.getPrice();
        
        System.out.println("Price calculated is: "+ housePrice);
        System.out.println("------------------------------");
        System.out.println("------- Mortgage Calculator -----------");
        System.out.println("------------------------------");
        
        System.out.print("Please enter loan amount: ");
        int loanAmount = sc.nextInt();
       
        System.out.print("Please enter loan term (in years): ");
        int termInYears = sc.nextInt();
       
        System.out.print("Please enter interest rate: ");
        double interestRate = sc.nextDouble();
        
        Adapter adapter = new Adapter(loanAmount, termInYears, interestRate);
        int monthlyPayment= (int)adapter.getPrice();
        System.out.println("\tMonthly payment is: $"+monthlyPayment);
    }
    
}
