package com.kushaggra.basePackage.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kushaggra.basePackage.model.CustomerBean;

@Repository
public interface ICustomerRepository extends JpaRepository<CustomerBean, Integer> {
	public CustomerBean findByCustomerTelephone(long number);
}
