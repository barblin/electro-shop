package at.electro.shop.service.transaction.mapper;

import at.electro.shop.service.api.models.Transaction;
import at.electro.shop.service.transaction.dao.models.Transactions;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TransactionMapper {

    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    Transaction toApi(Transactions transactions);

    Transactions toDao(Transaction transaction);

    List<Transactions> toDaoList(List<Transaction> transaction);

    List<Transaction> toApiList(List<Transactions> transactions);
}
