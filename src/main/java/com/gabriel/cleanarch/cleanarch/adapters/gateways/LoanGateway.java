package com.gabriel.cleanarch.cleanarch.adapters.gateways;

import com.gabriel.cleanarch.cleanarch.db.LoanEntityAdapter;
import com.gabriel.cleanarch.cleanarch.entities.Loan;

public interface LoanGateway {
    // todo: ver um jeito de retorna a entidade do nucleo
    LoanEntityAdapter create(Loan loan);
}