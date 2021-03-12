package at.electro.shop.service.transaction.services;

import at.electro.shop.service.api.models.Transaction;
import at.electro.shop.service.transaction.dao.TransactionDao;
import at.electro.shop.service.transaction.mapper.TransactionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private TransactionDao transactionDao;

    public TransactionService(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public List<Transaction> get() {
        return TransactionMapper.INSTANCE.toApiList(transactionDao.fetchAll());
    }
}
