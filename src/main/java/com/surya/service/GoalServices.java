package com.surya.service;

import java.util.List;

import com.surya.model.Goal;

public interface GoalServices {
	
	Goal save(Goal goal);

	List<Goal> findAllGaols();

}
