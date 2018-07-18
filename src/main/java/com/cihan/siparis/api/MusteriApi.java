package com.cihan.siparis.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cihan.siparis.dto.Musteri;
import com.cihan.siparis.service.musteri.MusteriService;

@RestController
@RequestMapping("/customers")
public class MusteriApi {
	
	@Autowired
	MusteriService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Musteri> listAllMusteri() {
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public boolean addNewMusteri(@RequestBody Musteri musteri) {
		service.save(musteri);
		return true;
	}
}
