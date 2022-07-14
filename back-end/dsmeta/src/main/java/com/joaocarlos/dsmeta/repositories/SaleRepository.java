package com.joaocarlos.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaocarlos.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> {
	

}
