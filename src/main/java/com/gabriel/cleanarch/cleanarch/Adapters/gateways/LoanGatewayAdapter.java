package com.gabriel.cleanarch.cleanarch.Adapters.gateways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.cleanarch.cleanarch.Adapters.Mappers.MapperEntityLoan;
import com.gabriel.cleanarch.cleanarch.Entities.Loan;
import com.gabriel.cleanarch.cleanarch.db.LoanEntityAdapter;
import com.gabriel.cleanarch.cleanarch.db.LoanRepositoryAdapterInterface;

@Service
public class LoanGatewayAdapter implements LoanGateway {

    @Autowired
    private LoanRepositoryAdapterInterface loanRepositoryAdapterInterface;

    @Override
    public LoanEntityAdapter create(Loan loan) {
        return loanRepositoryAdapterInterface.save( MapperEntityLoan.toLoanAdapter(loan) );
    }
    
}