package com.gabriel.cleanarch.cleanarch.Adapters.gateways;

import com.gabriel.cleanarch.cleanarch.Entities.Loan;
import com.gabriel.cleanarch.cleanarch.db.LoanEntityAdapter;

public interface LoanGateway {
    // todo: ver um jeito de retorna a entidade do nucleo
    LoanEntityAdapter create(Loan loan);
}