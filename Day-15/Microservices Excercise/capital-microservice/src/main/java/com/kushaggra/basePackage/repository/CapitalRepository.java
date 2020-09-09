package com.kushaggra.basePackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kushaggra.basePackage.model.CapitalBean;

public interface CapitalRepository extends JpaRepository<CapitalBean, String> {

}
