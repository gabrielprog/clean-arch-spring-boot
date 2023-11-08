package com.gabriel.cleanarch.cleanarch.useCases;

import com.gabriel.cleanarch.cleanarch.entities.Loan;

public class LoanUseCase implements LoanUseCaseInterface {

    public Loan createLoan(Loan loan) {
        Loan entity = loan;

        entity.setRateLoan(10);
        entity.applyInterest(loan.getPayment());
        
        return entity;
    }
}
