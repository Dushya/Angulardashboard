package com.hackfse.feedback.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class RegisteredNotParticipatedID implements Serializable {

	@Column(name = "event_id")
	private String event_id;

	@Column(name = "employee_id")
	private int employee_id;

	@Override
	public String toString() {
		return "RegisteredNotParticipatedID [event_id=" + event_id + ", employee_id=" + employee_id + "]";
	}

	public RegisteredNotParticipatedID(String event_id, int employee_id) {
		super();
		this.event_id = event_id;
		this.employee_id = employee_id;
	}

	public String getEvent_id() {
		return event_id;
	}

	public RegisteredNotParticipatedID() {
		super();
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

}

