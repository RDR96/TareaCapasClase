package com.rdr.capas.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rdr.capas.classes.LibraryForm;
import com.rdr.capas.classes.ParameterType;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView initMain() {		
		ModelAndView mav = new ModelAndView();	
		
		ArrayList<ParameterType> parameterList = new ArrayList<>();
		
		LibraryForm libraryForm = new LibraryForm();
		
		parameterList.add(new ParameterType("titulo","Título"));		
		parameterList.add(new ParameterType("autor","Autor"));
		parameterList.add(new ParameterType("genero","Género"));
		parameterList.add(new ParameterType("isbn","ISBN"));
		
		mav.addObject("parameterTypes", parameterList);
		
		mav.addObject("libraryForm", libraryForm);
		mav.setViewName("main");	
		
		return mav;
	}	
	
	
}
