package com.springData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository rep;
	
	@Transactional
	public void updatePersonEmail(String email, Integer id) {
		rep.updatePersonEmail(id, email);
	}
	
	@Transactional
	public void savePersons(List<Person> persons) {
		rep.saveAll(persons);
	}
}
