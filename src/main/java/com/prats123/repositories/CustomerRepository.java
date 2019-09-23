package com.prats123.repositories;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.prats123.entities.CustomerEntity;

@Repository
@Transactional
public class CustomerRepository extends AbstractRepository {
	
	public void save(CustomerEntity customerEntity) {
		entityManager.persist(customerEntity);
	}

}
