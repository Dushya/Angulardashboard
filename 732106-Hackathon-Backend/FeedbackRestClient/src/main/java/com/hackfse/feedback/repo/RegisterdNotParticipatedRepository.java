package com.hackfse.feedback.repo;

import org.springframework.data.repository.CrudRepository;

import com.hackfse.feedback.model.RegisterdNotParticipated;
import com.hackfse.feedback.model.RegisteredNotParticipatedID;


public interface RegisterdNotParticipatedRepository extends CrudRepository<RegisterdNotParticipated, RegisteredNotParticipatedID> {
	
	//List<RegisterdNotParticipated> findParticipant(RegisteredNotParticipatedID id);

}
