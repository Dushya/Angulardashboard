package com.hackfse.feedback.spring.dao;

import java.util.List;

import com.hackfse.feedback.model.RegisteredNotParticipated;

public interface RegisteredNotParticipatedDAO {
	List<RegisteredNotParticipated> getAllRegisteredNotParticipated();
	
	boolean updateRegisteredNotParticipated(RegisteredNotParticipated registeredNotParticipated);

}
