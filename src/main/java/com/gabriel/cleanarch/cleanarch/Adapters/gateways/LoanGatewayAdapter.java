package com.gabriel.cleanarch.cleanarch.Adapters.gateways;

import org.springframework.beans.factory.annotation.Autowired;

import com.gabriel.cleanarch.cleanarch.Adapters.Mappers.MapperEntityLoan;
import com.gabriel.cleanarch.cleanarch.Entities.Loan;
import com.gabriel.cleanarch.cleanarch.db.LoanEntityAdapter;
import com.gabriel.cleanarch.cleanarch.db.LoanRepositoryAdapterInterface;

public class LoanGatewayAdapter implements LoanGateway {

    // TODO: Não ta injetando a interface respository
    @Autowired
    private LoanRepositoryAdapterInterface loanRepositoryAdapterInterface;

    @Override
    public LoanEntityAdapter create(Loan loan) {
        return loanRepositoryAdapterInterface.save( MapperEntityLoan.toLoanAdapter(loan) );
    }
    
}