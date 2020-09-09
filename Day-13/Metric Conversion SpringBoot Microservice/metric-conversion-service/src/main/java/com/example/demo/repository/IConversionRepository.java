package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ConversionRate;

@Repository
public interface IConversionRepository extends JpaRepository<ConversionRate, Long> {
	public List<ConversionRate> findByFrom(String from);
}
