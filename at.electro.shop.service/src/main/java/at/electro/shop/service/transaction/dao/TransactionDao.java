package at.electro.shop.service.transaction.dao;

import at.electro.shop.service.transaction.dao.data.TransactionRepository;
import at.electro.shop.service.transaction.dao.models.Transactions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionDao {

    private TransactionRepository transactionRepository;

    public TransactionDao(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transactions> fetchAll() {
        return transactionRepository.findAll();
    }
}
