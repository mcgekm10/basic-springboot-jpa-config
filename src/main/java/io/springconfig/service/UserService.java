package io.springconfig.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springconfig.domain.User;
import io.springconfig.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	private List<User> list;
	
	public void save(User user) {
		repository.save(user);
	}
	
	public List<User> findProgrammers(List<String> skillsCriteria, Double matchCriteria) {
		String[] tempSkills;
		double percentage = 0.0;
		double criteriaSize = skillsCriteria.size();
		double matchSize = 0;
		list = repository.findAll();

		List<User> results = new ArrayList<User>();
		
		for(User u : list) {
			tempSkills = u.getSkills();
			matchSize = 0;
			
			for(String criteria : skillsCriteria) {
				for(String skills : tempSkills) {
					if(criteria.toLowerCase().equals(skills.toLowerCase())) {
						matchSize++;
					}
				}
			}
			
			if(matchSize > 0) 
				results.add(u);
			
			percentage = matchSize / criteriaSize;
			BigDecimal bd = new BigDecimal(percentage);
		    bd = bd.setScale(2, RoundingMode.HALF_UP);
			u.setPercentage(bd.doubleValue());
		}
		
		return sorted(results);
	}

	private List<User> sorted(List<User> results) {
		User temp;
		
		for(int i = 0; i < results.size(); i++) {
			for(int j = 0; j < results.size(); j++) {
				if(results.get(i).getPercentage() > results.get(j).getPercentage()) {
					temp = results.get(j);
					results.set(j, results.get(i));
					results.set(i, temp);
				}
			}
		}
		return results;
	}
}
