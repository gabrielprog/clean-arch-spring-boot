package com.gabriel.cleanarch.cleanarch.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepositoryAdapterInterface extends JpaRepository<LoanEntityAdapter, Long> { }
