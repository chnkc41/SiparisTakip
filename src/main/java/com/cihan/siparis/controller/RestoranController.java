package com.cihan.siparis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cihan.siparis.dto.Restoran;
import com.cihan.siparis.service.restoran.RestoranService;

@Controller
public class RestoranController {
	@Autowired
	RestoranService restoranService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String anaSayfa(Model model) {
		model.addAttribute("title", "Merhabaaaa");

		return "index"; // go to index page
	}

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String getExampleHTML(Model model) {
		model.addAttribute("title", "Merhabaaaa");

		return "test1"; // go to test1 page
	}

//	@RequestMapping(value = "/test2", method = RequestMethod.GET)
//	public String getExampleHTML2(Model model) {
//		model.addAttribute("title", "Merhabaaaa"); 
//
//		return "test2"; // go to test2 page
//	}

	@RequestMapping(value = "/restoranlar", method = RequestMethod.GET)
	public String restoranlar(Model model) {
		List<Restoran> restoranlarimiz = restoranService.findAll();

		model.addAttribute("restoranlar", restoranlarimiz);

		return "restoranlar"; // go to restoranlar page
	}
	
	@RequestMapping(value = "/restoranlarVue", method = RequestMethod.GET)
	public String restoranlarVue(Model model) {
		List<Restoran> restoranlarimiz = restoranService.findAll();

		model.addAttribute("restoranlar", restoranlarimiz);

		return "restoranlarVue"; // go to restoranlar page
	}

}
