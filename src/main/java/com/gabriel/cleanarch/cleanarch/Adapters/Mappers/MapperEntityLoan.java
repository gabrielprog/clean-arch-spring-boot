package com.gabriel.cleanarch.cleanarch.Adapters.Mappers;

import com.gabriel.cleanarch.cleanarch.db.LoanEntityAdapter;
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
        
        loanEntityAdapter.setPayment(loan.getPayment());
        loanEntityAdapter.setName(loan.getName());
        
        return loanEntityAdapter;
    }
}
