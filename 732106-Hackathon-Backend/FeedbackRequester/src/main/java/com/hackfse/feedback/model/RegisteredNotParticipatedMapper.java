package com.hackfse.feedback.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RegisteredNotParticipatedMapper implements RowMapper<RegisteredNotParticipated> {

	public RegisteredNotParticipated mapRow(ResultSet resultSet, int i) throws SQLException {

		RegisteredNotParticipated registeredNotParticipated = new RegisteredNotParticipated();
		registeredNotParticipated.setEvent_id(resultSet.getString("event_id"));
		registeredNotParticipated.setEvent_name(resultSet.getString("event_name"));
		registeredNotParticipated.setBeneficiary_name(resultSet.getString("beneficiary_name"));
		registeredNotParticipated.setBase_location(resultSet.getString("base_location"));
		registeredNotParticipated.setEvent_date(resultSet.getDate("event_date"));
		registeredNotParticipated.setEmployee_id(resultSet.getInt("employee_id"));
		registeredNotParticipated.setFeedback_requested(resultSet.getString("feedback_requested"));
		return registeredNotParticipated;
	}
}