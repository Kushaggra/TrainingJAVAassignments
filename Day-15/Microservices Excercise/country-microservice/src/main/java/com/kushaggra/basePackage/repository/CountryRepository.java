package com.kushaggra.basePackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kushaggra.basePackage.model.CountryBean;

@Repository
public interface CountryRepository extends JpaRepository<CountryBean, String> {
	public CountryBean findByCapital(String capital);
	public CountryBean findByCountryCode(String capital);
}
