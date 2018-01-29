package com.university;





import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/newstudent")
public class NewStudentController {

	
	@RequestMapping("/main")
	public String newStudentHome() {
		return "newstudent-home";
	}
	
	@RequestMapping("/form")
	public String newStudentForm(Model theModel) {
		
		theModel.addAttribute("newStudent", new NewStudent());
		
		
		return "newstudent-appform";
	}
	
	@RequestMapping("/confirm")
	public String newStudentConfirm(@Valid @ModelAttribute("newStudent") NewStudent newStudent, BindingResult br) {
		
		
		//date validation debugging
		System.out.println("DATE: "+newStudent.getDate());
		
		System.out.println("LANGS: "+newStudent.getLanguages());
		///
		
		
		if(br.hasErrors()) {
			return "newstudent-appform";
		}else {
		
		return "newstudent-confirm";
		}
	}
	
	
	@RequestMapping("/thankyou")
	public String newStudentEnd() {
		return "newstudent-thanks";
	}
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}

	
}
