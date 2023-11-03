package com.gabriel.cleanarch.cleanarch.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepositoryAdapterInterface extends JpaRepository<LoanEntityAdapter, Long> { }
