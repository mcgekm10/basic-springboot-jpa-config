package io.springconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	private String[] skills = {"Perl","Java","PHP","Swift","HTML","CSS","C++","C","C#","Scala","Javascript","Python",
			"Hibernate","Spring", "MySQL","ASP.Net","AJAX","XML", "AngularJS"};
	
	@RequestMapping("/search")
	public ModelAndView search() {
		ModelAndView model = new ModelAndView("search");
		model.addObject("skills", skills);
		return model;
	}

}
