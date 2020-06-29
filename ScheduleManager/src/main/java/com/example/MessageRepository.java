/**
 * 
 */
package com.example;

import org.springframework.data.jpa.repository.JpaRepository;



/**
 * @author sandip.mondal
 *
 */
public interface MessageRepository extends JpaRepository<ScheduleMessage, Long>{
	
	ScheduleMessage findById(String Id);

	void deleteById(String Id);

}
