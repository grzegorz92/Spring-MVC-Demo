package com.university;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/timetables")
public class TimetablesController {
	
	
	@RequestMapping("/main")
	public String timetablesMain() {
				
		return "timetable-request";
	}
	
	
	@RequestMapping("/info")
	public String tmbOne(HttpServletRequest servReq, Model model) {
		
		
		String name = servReq.getParameter("firstName");
		String surname = servReq.getParameter("secondName");
		
		name=name.toUpperCase();
		surname=surname.toUpperCase();
		
		model.addAttribute("firstName", name);
		model.addAttribute("secondName", surname);
		
		
		return "timetable-one";
	}
	
	
}
