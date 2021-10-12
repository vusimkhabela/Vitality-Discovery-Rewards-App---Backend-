package za.ac.nwu.ac.domain.persistence;

import com.mysql.cj.xdevapi.Table;

import java.time.LocalDate;
import java.util.Objects;
//import javax.persistence.*;
import java.io.serializable;
import java.util.Set;

@Entity
@Table(name = "discoverDB", schema = "discoveryDB");

public class AccountTransaction{
    private LocalDate ldate;
    private Long transactionId;
    private AccountType accountType;
    private Long amount;
    private Long memberId;

    public AccountTransaction()
    {

    }

    public AccountTransaction(LocalDate ldate, Long transactionId, AccountType accountType, Long amount, Long memberId)
    {
        this.ldate = ldate;
        this.transactionId = transactionId;
        this.accountType = accountType;
        this.amount = amount;
        this.memberId = memberId;

    }

    @Id
    //@SequenceGenerator(name = "", )

    @Column(name = "TX_ID")
    public long getTransactionId(){
        return transactionId;
    }
    @Column(name="MEMBER_ID")
    public long getMemberId(){
        return memberId;
    }
    @Column(name = "TX_DATE")
    public LocalDate getlDate(){
        return ldate;
    }
    @ManyToOne(fetch = FetchType.Lazy)
    @Column(name = "ACCOUNT_TYPE_ID")
    public AccountType getAccountType(){
        return accountType;
    }
public void setTransactionId(Long transactionId){
        this.transactionId = transactionId;
}
}

