/**
 * 
 */
package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author sandip.mondal
 *
 */
@Entity
@Table
public class ScheduleMessage {

	
	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column
	private String user_name;

	@Column
	private String message_content;

	@Column
	private String schedule_date_time;

	protected ScheduleMessage() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	

	/**
	 * @return the message_content
	 */
	public String getMessage_content() {
		return message_content;
	}

	/**
	 * @param message_content the message_content to set
	 */
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	/**
	 * @return the schedule_date_time
	 */
	public String getSchedule_date_time() {
		return schedule_date_time;
	}

	/**
	 * @param schedule_date_time the schedule_date_time to set
	 */
	public void setSchedule_date_time(String schedule_date_time) {
		this.schedule_date_time = schedule_date_time;
	}

	

	
}
