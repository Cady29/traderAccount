package com.cady.AccountManagement.Repository;

import com.cady.AccountManagement.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account ,Long> {

}
