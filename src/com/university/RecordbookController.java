package com.university;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recordbook")
public class RecordbookController {
	
	
	
	@RequestMapping("/main")
	public String timetablesMain() {
				
		return "recordbook-main";
	}



	

}
