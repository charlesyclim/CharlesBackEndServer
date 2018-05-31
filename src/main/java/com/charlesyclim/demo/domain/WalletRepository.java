package com.charlesyclim.demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface WalletRepository extends CrudRepository<Wallet, Long> {

}
