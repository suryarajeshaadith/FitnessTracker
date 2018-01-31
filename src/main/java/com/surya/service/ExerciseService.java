package com.surya.service;

import java.util.List;

import com.surya.model.Activity;
import com.surya.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

	

}