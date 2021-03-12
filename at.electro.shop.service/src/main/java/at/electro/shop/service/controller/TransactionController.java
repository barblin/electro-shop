package at.electro.shop.service.controller;

import at.electro.shop.service.api.models.Transaction;
import at.electro.shop.service.transaction.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/api/v1/transactions")
    public ResponseEntity<List<Transaction>> getProcessExecutions() {
        return ResponseEntity.ok(transactionService.get());
    }
}
