package org.parolafin.backend.service;

import lombok.RequiredArgsConstructor;
import org.parolafin.backend.entity.Transaction;
import org.parolafin.backend.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
