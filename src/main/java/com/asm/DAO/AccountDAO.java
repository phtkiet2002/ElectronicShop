package com.asm.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.Entity.Account;

public interface AccountDAO extends JpaRepository<Account, String>{

}
