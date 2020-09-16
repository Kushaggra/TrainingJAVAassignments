package com.kushaggra.basePackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kushaggra.basePackage.model.TelephoneBean;

@Repository
public interface ITelephoneRepository extends JpaRepository<TelephoneBean, Long> {
	TelephoneBean findByTelephoneNumber(long number);
}
