package com.gabriel.cleanarch.cleanarch.entities;

public class Loan {

    private int id;
    private String name;
    private int rateLoan;
    private int payment;

    public void setId(int id) { this.id = id; }
    public int getId() { return this.id; }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public void setPayment(int payment) { this.payment = payment; }
    public int getPayment() { return this.payment; }

    public void setRateLoan(int rateLoan) { this.rateLoan = rateLoan; }
    public int getRateLoan() { return this.rateLoan; }

    public void applyInterest(int monthOfPayment) {
        this.setPayment( (this.getRateLoan() * monthOfPayment) );
    }
}
