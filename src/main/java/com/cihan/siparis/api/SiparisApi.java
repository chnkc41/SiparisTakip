package com.cihan.siparis.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cihan.siparis.dto.Siparis;
import com.cihan.siparis.service.siparis.SiparisService;

@RestController
@RequestMapping("/siparis")
public class SiparisApi {
	
	@Autowired
	SiparisService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Siparis> listAllMenu() throws SQLException {
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public boolean addNewMusteri(@RequestBody Siparis Siparis) throws SQLException {
		service.save(Siparis);
		return true;
	}
}
