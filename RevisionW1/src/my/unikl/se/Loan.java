/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.unikl.se;

/**
 *
 * @author MIIT
 */
public class Loan {
    public double annualInterestRate;
    public int numberOfYears;
    public double LoanAmount;
    
    public Loan() {
    }
    public Loan(double annualInterestRate, int numberOfYears, double LoanAmount){
       this.annualInterestRate=annualInterestRate;
       this.numberOfYears=numberOfYears;
       this.LoanAmount=LoanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getAmount() {
        return LoanAmount;
    }

    public void setAmount(double Amount) {
        this.LoanAmount = Amount;
    }
   
    
    public double getMontlyPayment(){
        double monthlyInterestRate= annualInterestRate/1200;
        return  LoanAmount *monthlyInterestRate/(1-(Math.pow(1/(1+monthlyInterestRate),numberOfYears*12)));
        
    }
    
    public double getTotalPayment(){
        return getMontlyPayment()*numberOfYears*12;
    }
    
    
    
}
