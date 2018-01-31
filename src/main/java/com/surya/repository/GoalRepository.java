package com.surya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.surya.model.Goal;


@Repository("goalRepository")
public interface  GoalRepository extends JpaRepository<Goal,Long> {
	@Query("Select g from Goal g")
	public List<Goal> findAllGaols();
	
}