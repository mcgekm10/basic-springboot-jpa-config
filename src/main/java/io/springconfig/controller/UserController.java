package io.springconfig.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.springconfig.domain.User;
import io.springconfig.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/submit")
	public String findUsers(@RequestParam("skills") String[] skills,
			Model model) {
		List<String> skillsList = new ArrayList<String>();
		
		if(skills != null) {
			for(String s : skills)
				skillsList.add(s);
		}
		double matchCriteriaDouble = 0.0;
		List<User> programmers = service.findProgrammers(skillsList,matchCriteriaDouble);
		if(programmers != null)
			model.addAttribute("programmers",programmers);
		return "results";
	}
}
