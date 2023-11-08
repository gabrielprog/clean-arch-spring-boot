package com.gabriel.cleanarch.cleanarch.adapters.gateways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.cleanarch.cleanarch.adapters.mappers.MapperEntityLoan;
import com.gabriel.cleanarch.cleanarch.db.LoanEntityAdapter;
import com.gabriel.cleanarch.cleanarch.db.LoanRepositoryAdapterInterface;
import com.gabriel.cleanarch.cleanarch.entities.Loan;

@Service
public class LoanGatewayAdapter implements LoanGateway {

    @Autowired
    private LoanRepositoryAdapterInterface loanRepositoryAdapterInterface;

    @Override
    public LoanEntityAdapter create(Loan loan) {
        return loanRepositoryAdapterInterface.save( MapperEntityLoan.toLoanAdapter(loan) );
    }
    
}