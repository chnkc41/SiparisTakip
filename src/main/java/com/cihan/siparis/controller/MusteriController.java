package com.cihan.siparis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cihan.siparis.dto.Musteri;
import com.cihan.siparis.service.musteri.MusteriService;

@Controller
public class MusteriController {

	@Autowired
	MusteriService musteriService;

//	@RequestMapping(value = "/musteriler", method = RequestMethod.GET)
//	public String musteriler(Model model) {
//		List<Musteri> musterilerimiz = musteriService.findAll();
//		model.addAttribute("musteri", musterilerimiz);
//		return "musteriler";
//	}
	
	
	@RequestMapping(value = "/musteriler", method = RequestMethod.GET)
	public String musteriler(Model model) {
		List<Musteri> musterilerimiz = musteriService.findAll();
		
        model.addAttribute("musteri", musterilerimiz);  // musteriler sayfasında ${musteri} olarak çekildi.
        
        return "musteriler";
    }

}
