package com.hackfse.feedback.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackfse.feedback.model.RegisterdNotParticipated;
import com.hackfse.feedback.model.RegisteredNotParticipatedID;
import com.hackfse.feedback.repo.RegisterdNotParticipatedRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FeedbackController {

	
	@Autowired
	RegisterdNotParticipatedRepository registerdNotParticipatedRepository;
	
	@GetMapping("/regnotpart")
	public List<RegisterdNotParticipated> getAllRegisterdNotParticipated() {
		System.out.println("Get all RegisterdNotParticipated...");

		List<RegisterdNotParticipated> regnotpart = new ArrayList<>();
		registerdNotParticipatedRepository.findAll().forEach(regnotpart::add);

		return regnotpart;
	}

	
	@PutMapping("/regnotpart/update/{event_id}/{employee_id}")
	public @ResponseBody ResponseEntity<RegisterdNotParticipated> updateRegisterdNotParticipated(@PathVariable("event_id") String event_id, @PathVariable("employee_id") int employee_id, 
			@RequestBody RegisterdNotParticipated registerdNotParticipated) {
		System.out.println("Update RegisterdNotParticipated with event_id = " + event_id + "and employee_id ="+employee_id);
		
		RegisteredNotParticipatedID registerdNotParticipatedID = new RegisteredNotParticipatedID(event_id,employee_id);

		Optional<RegisterdNotParticipated> registerdNotParticipatedData = registerdNotParticipatedRepository.findById(registerdNotParticipatedID);

		if (registerdNotParticipatedData.isPresent()) {
			RegisterdNotParticipated _regnotpart = registerdNotParticipatedData.get();
			_regnotpart.setFeedback(registerdNotParticipated.getFeedback());
			return new ResponseEntity<>(registerdNotParticipatedRepository.save(_regnotpart), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
