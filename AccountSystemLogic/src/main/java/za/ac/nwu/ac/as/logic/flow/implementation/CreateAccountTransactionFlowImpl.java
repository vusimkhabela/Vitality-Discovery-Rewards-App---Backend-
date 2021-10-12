package za.ac.nwu.ac.as.logic.flow.implementation;

import org.springframework.stereotype.Component;

import za.ac.nwu.ac.as.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.ac.domain.dto.AccountTransactionDto;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.domain.persistence.AccountTransactionDetails;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.as.logic.flow.CreateAccountTransactionFlow;
import za.ac.nwu.ac.translator.AccountTransactionTranslator;
import za.ac.nwu.ac.translator.TransactionDetailsTranslator;
//
//import javax.transaction.Transactional;
//
//@Transactional
//@Component
//public class CreateAccountTransactionFlowImpl implements CreateAccountTransactionFlow {
//
//    private static final logger LOGGER = loggerfactory.getLogger(createAccountTransactionFlowImpl.class);
//
//    private final AccountTransactionTranslator accountTransactionTranslator;
//    private final TransactionDetailsTranslator transactionDetailsTranslator;
//    private final FetchAccountTypeFlow FetchAccountTypeFlow;
//
//    public CreateAccountTransactionFlowImpl(AccountTransactionTranslator accountTransactionTranslator,
//                                            TransactionDetailsTranslator transactionDetailsTranslator,
//                                            FetchAccountTypeFlow fetchAccountTypeFlow, FetchAccountTypeFlow fetchAccountTypeFlow1){
//
//        this.FetchAccountTypeFlow = fetchAccountTypeFlow;
//        this.AccountTransactionTranslator = accountTransactionTranslator;
//        this.TransactionDetailsTranslator = transactionDetailsTranslator;
//        this.accountTransactionTranslator = null;
//    }
//
//    @Override
//    public AccountTransactionDto create(AccountTransactionDto accountTransactionDTO){
//
//        LOGGER.info("The input was {}", accountTransactionDTO);
//
//        accountTransactionDTO.setTransactionId(null);
//
//        AccountType accountType = fetchAccountTypeFlow.getAccountAccountDBEntityByMnemonic(
//                accountTransactionDTO.getAccountTypeMnemonic());
//        LOGGER.info("Got AccountType for {} and the AccountTypeID is {}", accountTransactionDTO, getAccountTypeMnemonic)
//        AccountTransaction accountTransaction = accountTransactionDTO.buildAccountTransaction(accountType);
//        AccountTransaction createdAccountTransaction = accountTransactionTranslator.save(accountTransaction);
//
//        if( null != accountTransactionDTO.getDetails()){
//            AccountTransactionDetails accountTransactionDetails = accountTransactionDTO.getDetails()
//                    .buildAccountTransactionDetails(createdAccountTransaction);
//            createdAccountTransaction.setDetails(accountTransactionDetails);
//            transactionDetailsTranslator.save(createdAccountTransaction.getDetails());
//
//        }
//
//        AccountTransactionDto results = new AccountTransactionDto(createdAccountTransaction);
//        LOGGER.info("The output was {}", results);
//        return new AccountTransactionDto(createdAccountTransaction);
//    }
//}
//
