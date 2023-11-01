package com.gabriel.cleanarch.cleanarch.UseCases;

import com.gabriel.cleanarch.cleanarch.Entities.Loan;

public class LoanUseCase implements LoanUseCaseInterface {

    public Loan createLoan(Loan loan) {
        Loan entity = loan;

        entity.setRateLoan(10);
        entity.applyInterest(loan.getPayment());
        
        return entity;
    }
}
