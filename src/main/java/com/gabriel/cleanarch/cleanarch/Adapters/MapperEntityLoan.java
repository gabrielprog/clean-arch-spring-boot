package com.gabriel.cleanarch.cleanarch.Adapters;

import com.gabriel.cleanarch.cleanarch.Entities.Loan;

public class MapperEntityLoan {
    
    private MapperEntityLoan() {}

    public static Loan toLoan(LoanEntityAdapter loanEntityAdapter) {
        Loan loan = new Loan();
        
        loan.setPayment(loanEntityAdapter.getPayment());
        loan.setName(loanEntityAdapter.getName());
        
        return loan;
    }

    public static LoanEntityAdapter toLoanAdapter(Loan loan) {
        LoanEntityAdapter loanEntityAdapter = new LoanEntityAdapter();
        
        loan.setPayment(loan.getPayment());
        loan.setName(loan.getName());
        
        return loanEntityAdapter;
    }
}
