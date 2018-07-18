package com.cihan.siparis.service.restoran;

import java.util.List;

import com.cihan.siparis.dto.Restoran;

public interface RestoranService {
	public List<Restoran> findAll();

	public Restoran save(Restoran newRestoran);
	
	public void update(Restoran Restoran);
	
	public void delete(Restoran Restoran);
	
	
	
}
