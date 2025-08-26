package org.parolafin.backend.repository;

import org.parolafin.backend.entity.AppUser;
import org.parolafin.backend.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByUser(AppUser user);
}
