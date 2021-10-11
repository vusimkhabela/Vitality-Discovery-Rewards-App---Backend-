package za.ac.nwu.ac.domain.persistence;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class AccountType {

    private LocalDate ldate;
    private String mnemonic;
    private Set<AccountTransaction> accountTransactions;
    private Object typeID;
    private String name;

    public void setMnemonic(String mnemonic){
        this.mnemonic = mnemonic;
    }

    public void setLDate(LocalDate ldate){
        this.ldate = ldate;
    }

//    @OneToMany(targetEntity = AccountTransaction.class, fetch = fetchType.LAZY, mappedBy = )
    public Set<AccountTransaction> getAccountTransactions(){
        return accountTransactions;
    }

    public void setAccountTransactions(Set<AccountTransaction> accountTransactions){
        this.accountTransactions = accountTransactions;
    }

    @Override
    public boolean equals(Object a){
        if(this == a){
            return true;
        }
        if(a == null || getClass() != a.getClass()){
            return false;
        }
        AccountType that = (AccountType) a;
        return typeID == that.typeID && Objects.equals(name, that.name);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(typeID, name, ldate, mnemonic, accountTransactions);
    }

    @Override
    public String toString(){
        return "AccountType{" + "TypeID: " + typeID + "Name: " + name + "Date: " + ldate
                + "Mnemonic: " + mnemonic + "accountTransaction " + accountTransactions + " }";
    }



}
