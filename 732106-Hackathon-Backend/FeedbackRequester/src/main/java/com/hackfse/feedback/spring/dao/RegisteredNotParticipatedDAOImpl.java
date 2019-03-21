package com.hackfse.feedback.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hackfse.feedback.model.RegisteredNotParticipated;
import com.hackfse.feedback.model.RegisteredNotParticipatedMapper;

@Component
public class RegisteredNotParticipatedDAOImpl implements RegisteredNotParticipatedDAO {

	JdbcTemplate jdbcTemplate;
	private final String SQL_UPDATE_PERSON = "update registered_not_participated set feedback_requested='Y' where event_id= ? and employee_id= ? ";
	private final String SQL_GET_ALL = "select * from registered_not_participated where feedback_requested='N'";
	
	@Autowired
	public RegisteredNotParticipatedDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<RegisteredNotParticipated> getAllRegisteredNotParticipated() {
		return jdbcTemplate.query(SQL_GET_ALL, new RegisteredNotParticipatedMapper());
	}

	public boolean updateRegisteredNotParticipated(RegisteredNotParticipated registeredNotParticipated) {
		return jdbcTemplate.update(SQL_UPDATE_PERSON, registeredNotParticipated.getEvent_id(),registeredNotParticipated.getEmployee_id()) > 0;
	}
}
