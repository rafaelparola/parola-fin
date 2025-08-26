package org.parolafin.backend.service;

import lombok.RequiredArgsConstructor;
import org.parolafin.backend.entity.AppUser;
import org.parolafin.backend.entity.Transaction;
import org.parolafin.backend.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionsByUserId(AppUser user) {
        return transactionRepository.findByUser(user);
    }
}
