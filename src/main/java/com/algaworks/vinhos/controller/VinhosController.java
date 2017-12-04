package com.algaworks.vinhos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.vinhos.model.Vinho;

@Controller
@RequestMapping("/vinhos")
public class VinhosController {
	
	@GetMapping("/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("vinhos/cadastro-vinho");
		modelAndView.addObject("vinho", new Vinho());
		return modelAndView;
	}

}
