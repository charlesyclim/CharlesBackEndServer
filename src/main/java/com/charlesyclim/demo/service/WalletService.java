package com.charlesyclim.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.charlesyclim.demo.domain.Wallet;
import com.charlesyclim.demo.domain.WalletRepository;

@Service
@Transactional(readOnly=true)
public class WalletService {

	@Autowired
	private WalletRepository repo;
	
	public Iterable<Wallet> getEntities() {
		// TODO Auto-generated method stub
		Iterable<Wallet> wallets = repo.findAll();
		return wallets;
	}

	public Wallet getEntity(Long id) {
		// TODO Auto-generated method stub
		Wallet wallet = repo.findOne(id);
		return wallet;
	}

	@Transactional(readOnly = false, propagation=Propagation.REQUIRED)
	public Wallet create(Wallet entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	@Transactional(readOnly = false, propagation=Propagation.REQUIRED)
	public Wallet update(Long id) {
		// TODO Auto-generated method stub
		Wallet wallet = repo.findOne(id);
		if (wallet != null) {
			return repo.save(wallet);
		}
		return null;
	}

	@Transactional(readOnly = false, propagation=Propagation.REQUIRED)
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		Wallet wallet = repo.findOne(id);
		if (wallet != null) {
			repo.delete(wallet);
			return true;
		}
		return false;
	}

}
