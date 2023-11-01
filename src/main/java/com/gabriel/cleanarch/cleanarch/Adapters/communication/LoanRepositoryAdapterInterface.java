package com.gabriel.cleanarch.cleanarch.Adapters.communication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepositoryAdapterInterface extends JpaRepository<LoanEntityAdapter, Long> { }
