package com.gabriel.cleanarch.cleanarch.Adapters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.cleanarch.cleanarch.Adapters.Mappers.MapperEntityLoan;
import com.gabriel.cleanarch.cleanarch.Adapters.gateways.LoanGatewayAdapter;
import com.gabriel.cleanarch.cleanarch.db.LoanEntityAdapter;
import com.gabriel.cleanarch.cleanarch.Entities.Loan;
import com.gabriel.cleanarch.cleanarch.UseCases.LoanUseCase;
import com.gabriel.cleanarch.cleanarch.UseCases.LoanUseCaseInterface;

@RestController
@RequestMapping("/loan")
public class LoanControllerAdapter {
    
    @Autowired
    private LoanGatewayAdapter loanGateway;
     
    @PostMapping
    public LoanEntityAdapter create(@RequestBody LoanEntityAdapter loanRequest) {
        LoanUseCaseInterface loanUseCase = new LoanUseCase();
        Loan loan = loanUseCase.createLoan( MapperEntityLoan.toLoan(loanRequest) );

        return loanGateway.create(loan);
    }
}
