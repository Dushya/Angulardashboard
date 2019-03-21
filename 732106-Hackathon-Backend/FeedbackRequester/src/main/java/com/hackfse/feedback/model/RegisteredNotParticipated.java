package com.hackfse.feedback.model;

import java.sql.Date;

public class RegisteredNotParticipated {
	private String event_id;
	private String event_name;
	private String beneficiary_name;
	private String base_location;
	private Date event_date;
	private Integer employee_id;
	private String feedback_requested;

	public RegisteredNotParticipated() {
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getBeneficiary_name() {
		return beneficiary_name;
	}

	public void setBeneficiary_name(String beneficiary_name) {
		this.beneficiary_name = beneficiary_name;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public Date getEvent_date() {
		return event_date;
	}

	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getFeedback_requested() {
		return feedback_requested;
	}

	public void setFeedback_requested(String feedback_requested) {
		this.feedback_requested = feedback_requested;
	}

	@Override
	public String toString() {
		return "RegisteredNotParticipated [event_id=" + event_id + ", event_name=" + event_name + ", beneficiary_name="
				+ beneficiary_name + ", base_location=" + base_location + ", event_date=" + event_date
				+ ", employee_id=" + employee_id + ", feedback_requested=" + feedback_requested + "]";
	}

	public RegisteredNotParticipated(String event_id, String event_name, String beneficiary_name, String base_location,
			Date event_date, Integer employee_id, String feedback_requested) {
		super();
		this.event_id = event_id;
		this.event_name = event_name;
		this.beneficiary_name = beneficiary_name;
		this.base_location = base_location;
		this.event_date = event_date;
		this.employee_id = employee_id;
		this.feedback_requested = feedback_requested;
	}

}
