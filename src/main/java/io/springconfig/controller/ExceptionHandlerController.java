package io.springconfig.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionHandlerController implements ErrorController{
	private static final String PATH = "/error";
	
	@RequestMapping("/error")
	public String error() {
		return "redirect:/search";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}
}
