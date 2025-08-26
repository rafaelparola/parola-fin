package org.parolafin.backend.controller;

import lombok.RequiredArgsConstructor;
import org.parolafin.backend.entity.AppUser;
import org.parolafin.backend.entity.Transaction;
import org.parolafin.backend.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transactions", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        Transaction saved = transactionService.createTransaction(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions(@RequestBody AppUser user) {
        List<Transaction> transactions = transactionService.getTransactionsByUserId(user);
        return ResponseEntity.status(HttpStatus.OK).body(transactions);
    }
}
