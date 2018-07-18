package com.cihan.siparis.service.siparismenu;

import java.util.List;

import com.cihan.siparis.dto.SiparisMenu;

public interface SiparisMenuService {
	public List<SiparisMenu> findAll();
	public void save(SiparisMenu SiparisMenu);
}
