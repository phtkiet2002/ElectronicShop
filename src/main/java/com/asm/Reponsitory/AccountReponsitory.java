package com.asm.Reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.Entity.Account;

public interface AccountReponsitory extends JpaRepository<Account, String>{

}
