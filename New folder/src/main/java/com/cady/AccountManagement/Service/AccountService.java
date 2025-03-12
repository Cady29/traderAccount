package com.cady.AccountManagement.Service;


import com.cady.AccountManagement.Entity.Account;
import com.cady.AccountManagement.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.boot.autoconfigure.container.ContainerImageMetadata.isPresent;

@Service

public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    //creating an account
    public Account createAccount(Account account){

        return accountRepository.save(account);
    }

    //delete an account
    public void deleteAccount(long id){
        accountRepository.deleteById(id);
    }


    //get all account
    public List<Account> getAllAccount(){

        return accountRepository.findAll();
    }
    //get account by id

    public Optional<Account> getAccountById(long id){

        return accountRepository.findById(id);

    }

    //update account


    public Account updateAccount(long id, Account updatedAccount){
        // find the account by id
        Optional<Account> existingAccount = accountRepository.findById(id);


        if (existingAccount.isPresent()) {
            // get the existing account

            Account account = existingAccount.get();


            //update fields

            account.setUserName(updatedAccount.getUserName());
            account.setBalance(updatedAccount.getBalance());


            // save the updated account

            return accountRepository.save(account);
        }else {
            //throw an error if the account is not found

            throw new RuntimeException("account not found");



        }
    }

}
