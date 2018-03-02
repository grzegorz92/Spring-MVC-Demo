package com.university;





import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.university.entity.NewStudent;
import com.university.service.NewService;


class Countries{
	
	private Map<String, String> list = new LinkedHashMap<>();
	private String[] locales = Locale.getISOCountries();
	
	
	public Map<String,String> getCountriesList(){
		
		for(String elements: locales) {			 
			Locale loc = new Locale("",elements);
			list.put(loc.getCountry(), loc.getDisplayCountry());
			 
		 }
		
		
		return list;
	}
}	


@Controller
@RequestMapping("/newstudent")
public class NewStudentController {
	
	@Autowired
	private NewService newService;
	
	private NewStudent ns = new NewStudent();

	
	@RequestMapping("/main")
	public String newStudentHome() {
		return "newstudent-home";
	}
	
	@RequestMapping("/form")
	public String newStudentForm(Model theModel) {
		
		Countries country = new Countries();
		
		
		theModel.addAttribute("countryList",country.getCountriesList());
		theModel.addAttribute("newStudent", new NewStudent());
		
		return "newstudent-appform";
	}
	
	@RequestMapping("/confirm")
	public String newStudentConfirm(@Valid @ModelAttribute("newStudent") NewStudent newStudent, BindingResult br) {
		
		
		//date validation debugging
		//System.out.println("DATE: "+newStudent.getDate());
		
		//System.out.println("LANGS: "+newStudent.getLanguages());
		///
		
		ns=newStudent;
		if(br.hasErrors()) {
			return "newstudent-appform";
			
		}else {
			
			return "newstudent-confirm";
		}
	}
	
	
	@RequestMapping("/thankyou")
	public String newStudentEnd() {
		
		
	
		newService.saveData(ns);
		
		return "newstudent-thanks";
	}
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}

	
}
