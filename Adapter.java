/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myadapter;

import myadapter.com.mortgagecalc.MortgagePaymentCalculator;


/**
 *
 * @author arash
 */
public class Adapter implements IHouses{
      private int loanAmount;
      private int termInYears;
      private double interestRate ;
      private double monthluPayment;

      
    public Adapter(int loanAmount, int termInYears, double interestRate) {
        this.loanAmount = loanAmount;
        this.termInYears = termInYears;
        this.interestRate = interestRate;
    }

    MortgagePaymentCalculator calc = new MortgagePaymentCalculator();
    
    @Override
    public double getPrice() {
        monthluPayment= calc.calculateMonthlyPayment(loanAmount, termInYears, interestRate);
        return monthluPayment;
    }
    


    
}
