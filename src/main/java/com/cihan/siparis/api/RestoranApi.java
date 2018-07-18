package com.cihan.siparis.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cihan.siparis.dto.Restoran;
import com.cihan.siparis.service.restoran.RestoranService;

@RestController
@RequestMapping("/restorans")
public class RestoranApi {

	@Autowired
	RestoranService service;

	@RequestMapping(method = RequestMethod.GET)
	public List<Restoran> listAllRestorans() {
		return service.findAll();
	}

	@RequestMapping(method = RequestMethod.POST) // Post for insert
	public Restoran addNewRestoran(@RequestBody Restoran restoran) {
		return service.save(restoran);
	}

	@RequestMapping(method = RequestMethod.PUT) // Put for update
	public boolean updateRestoran(@RequestBody Restoran restoran) {
		service.update(restoran);
		return true;
	}

	@RequestMapping(value = "/vidi", method = RequestMethod.PUT) // put for another update
	public boolean updateRestoran2(@RequestBody Restoran restoran) {
		service.update(restoran);
		return true;
	}

	@RequestMapping(method = RequestMethod.DELETE) // Post for insert
	public boolean deleteRestoran(@RequestBody Restoran restoran) {
		service.delete(restoran);
		return true;
	}
}
