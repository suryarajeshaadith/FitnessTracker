package com.surya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.surya.model.Goal;
import com.surya.repository.GoalRepository;

@Service("goalService")
public class GoalServicesImpl implements GoalServices {

	@Autowired
	private GoalRepository goalRepository;
	
	@Transactional
	public Goal save(Goal goal) {
		
		return goalRepository.save(goal);
	}

	public List<Goal> findAllGaols() {
		
		return goalRepository.findAll();
	}

}
