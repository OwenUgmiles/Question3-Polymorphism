/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loan;

/**
 *
 * @author HP
 */

    abstract class Loan {
    public int loan_id;
    public String loan_type;
    public double amount;
    public String cust_name;

    // Default no-arg constructor
    public Loan() {
        this.amount = 0;
    }

    // Set methods
    public void setLoanId(int loan_id) {
        this.loan_id = loan_id;
    }

    public void setCustName(String cust_name) {
        this.cust_name = cust_name;
    }

    // Get methods
    public int getLoanId() {
        return loan_id;
    }

    public String getCustName() {
        return cust_name;
    }

    // Method to set loan amount
    public void setLoanAmount(double amount) {
        this.amount = amount;
    }

    // Method to get loan amount
    public double getLoanAmount() {
        return amount;
    }

    // Abstract method to indicate loan type
    public abstract String getLoanType(); 
}



class HomeLoan extends Loan {
   
    public double calculateInterest() {
        // Implementation for calculating home loan interest
        return amount * 0.05; // Example interest rate
    }

    @Override
    public String getLoanType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Main {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.setLoanId(1234);
        homeLoan.setCustName("John Doe");
        homeLoan.setLoanAmount(100000);

        System.out.println("Loan ID: " + homeLoan.getLoanId());
        System.out.println("Customer Name: " + homeLoan.getCustName());
        System.out.println("Interest: " + homeLoan.calculateInterest());
    }
}

    

