package com.hackfse.feedback.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registered_not_participated")
public class RegisterdNotParticipated implements Serializable {
	
	
	@Column(name = "feedback")
	private String feedback;
	
	@Column(name = "event_name")
	private String eventName;
	
	@Column(name = "beneficiary_name")
	private String beneficiaryName;
	
	@Column(name = "base_location")
	private String baseLocation;
		
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	@Column(name = "event_date")
	private Date eventDate;

	@EmbeddedId
	RegisteredNotParticipatedID id;
	
	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public RegisteredNotParticipatedID getId() {
		return id;
	}

	public void setId(RegisteredNotParticipatedID id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RegisterdNotParticipated [feedback=" + feedback + ", id=" + id + "]";
	}

	public RegisterdNotParticipated(String feedback, RegisteredNotParticipatedID id) {
		super();
		this.feedback = feedback;
		this.id = id;
	}

	public RegisterdNotParticipated() {
		super();
	}
	
	

}
