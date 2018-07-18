package com.cihan.siparis.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cihan.siparis.dto.Menu;
import com.cihan.siparis.service.menu.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuApi {
	
	@Autowired
	MenuService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Menu> listAllMenu() throws SQLException {
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public boolean addNewMusteri(@RequestBody Menu menu) throws SQLException {
		service.save(menu);
		return true;
	}
}
