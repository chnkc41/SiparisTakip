package com.cihan.siparis.api;
//package com.cihan.siparis.api;
//
//import java.sql.SQLException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cihan.siparis.dto.SiparisMenu;
//import com.cihan.siparis.service.siparismenu.SiparisMenuService;
//
//@RestController
//@RequestMapping("/siparismenu")
//public class SiparisMenuController {
//	
//	@Autowired
//	SiparisMenuService service;
//	
//	@RequestMapping(method = RequestMethod.GET)
//	public List<SiparisMenu> listAllMenu() throws SQLException {
//		return service.findAll();
//	}
//	
//	@RequestMapping(method = RequestMethod.POST)
//	public boolean addNewMusteri(@RequestBody SiparisMenu Siparismenu) throws SQLException {
//		service.save(Siparismenu);
//		return true;
//	}
//}
