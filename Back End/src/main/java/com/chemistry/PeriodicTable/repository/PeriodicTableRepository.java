package com.chemistry.PeriodicTable.repository;

import org.springframework.stereotype.Repository;
import com.chemistry.PeriodicTable.model.PeriodicTable;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PeriodicTableRepository extends JpaRepository<PeriodicTable, Short> {

}
	
