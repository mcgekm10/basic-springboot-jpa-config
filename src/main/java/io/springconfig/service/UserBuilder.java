package io.springconfig.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springconfig.domain.User;

/* Add programmers to the repository */
@Service
public class UserBuilder {
	@Autowired
	UserService service;
	
	@PostConstruct
	public void init() {
		service.save(new User("Anil Prasad",new String[]{"C","C++"}));
		service.save(new User("Derrick McCray",new String[]{"Javascript","XML","HTML","CSS","AngularJS","AJAX"}));
		service.save(new User("Kandle McGee",new String[]{"Java","Spring","Hibernate","CSS","HTML","MySQL"}));
		service.save(new User("David Daniels",new String[]{"Javascript","CSS","HTML","Python"}));
		service.save(new User("Jill Tanner",new String[]{"C#",".NET","Java"}));
		service.save(new User("Joshua Stanley",new String[]{"C","Perl"}));
		service.save(new User("John Potter",new String[]{"Scala"}));
		service.save(new User("Ronald McDonald",new String[]{"C","Scala","Swift"}));
		service.save(new User("Felicia Nikolas",new String[]{"HTML","CSS","PHP","Python","AJAX","Javascript"}));
		service.save(new User("Alexa Jones",new String[]{"PHP","Perl","Python"}));
		service.save(new User("Brenda Pearl",new String[]{"C","C++","Java","MySQL","Spring","Hibernate"}));
		service.save(new User("Paul Goddard",new String[]{"C#","C++","Java","MYSQL"}));
		service.save(new User("Dennis Taylor",new String[]{"C#","HTML","CSS","MYSQL"}));
		service.save(new User("Cherise Brand",new String[]{"Python","Javascript"}));
	}
}
