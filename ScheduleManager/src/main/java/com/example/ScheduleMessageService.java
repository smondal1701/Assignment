/**
 * 
 */
package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sandip.mondal
 *
 */

@Service
@Transactional
public class ScheduleMessageService {

	@Autowired
	private MessageRepository repo;

	public List<ScheduleMessage> listAll() {
		return repo.findAll();
	}

	public void save(ScheduleMessage product) {
		repo.save(product);
	}

	public ScheduleMessage get(String id) {
		// return repo.findById(id).get();
		return repo.findById(id);
	}

	public void delete(String id) {
		repo.deleteById(id);
	}

}
