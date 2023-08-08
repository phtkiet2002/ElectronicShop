package com.asm.Reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import com.asm.Entity.Account;
import com.asm.Entity.Authority;

public interface AuthorityReponsitory extends JpaRepository<Authority, Integer>{
    @Query("SELECT DISTINCT a FROM Authority a WHERE a.account IN ?1")
	List<Authority> authoritiesOf(List<Account> accounts);
}
