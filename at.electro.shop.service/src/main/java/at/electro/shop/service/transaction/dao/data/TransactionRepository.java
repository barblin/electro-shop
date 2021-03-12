package at.electro.shop.service.transaction.dao.data;

import at.electro.shop.service.transaction.dao.models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {
    public List<Transactions> findAll();
}
