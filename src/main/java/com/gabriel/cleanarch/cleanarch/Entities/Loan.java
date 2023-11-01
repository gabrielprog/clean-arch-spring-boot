package com.gabriel.cleanarch.cleanarch.Entities;

public class Loan {
    private int rateLoan;

    public void setRateLoan(int rateLoan) { this.rateLoan = rateLoan; }
    public int getRateLoan() { return this.rateLoan; }

    public int applyInterest(int monthOfPayment) {
        return this.getRateLoan() * monthOfPayment;
    }
}
