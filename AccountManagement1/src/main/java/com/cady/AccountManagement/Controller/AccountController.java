package com.cady.AccountManagement.Controller;

import com.cady.AccountManagement.Entity.Account;
import com.cady.AccountManagement.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;


    //create account

    @PostMapping
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }
 //get account
    @GetMapping
    public List<Account> getAllAccounts(){
        return accountService.getAllAccount();
    }
//get account by id
    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable long id) {
        return accountService.getAccountById(id);
    }
    //update account
    @PutMapping("/{id}")

    public Account updateAccount(@PathVariable long id, @RequestBody Account updatedAccount) {
        return accountService.updateAccount(id, updatedAccount);
    }
//delete account

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable long id) {
        accountService.deleteAccount(id);
        return "Account deleted successfully!";
    };
}
