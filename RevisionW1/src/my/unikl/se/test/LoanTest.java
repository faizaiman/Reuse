/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.unikl.se.test;

import my.unikl.se.Loan;

/**
 *
 * @author MIIT
 */
public class LoanTest {
    public static void main(String[]args){
        Loan L1 = new Loan(5,12,100000);
        
        System.out.println("Loan"+L1.LoanAmount+"Monthly Payment"+L1.getMontlyPayment()+"TotalPayment"+L1.getTotalPayment());
    }
}
