package com.asm.Reponsitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.asm.Entity.Account;

public interface AccountReponsitory extends JpaRepository<Account, String>{
	Optional<Account> findByUsernameAndPassword(String username, String password);
}
