package com.cihan.siparis.service.musteri;

import java.util.List;

import com.cihan.siparis.dto.Musteri;

public interface MusteriService {
	public List<Musteri> findAll();
	public void save(Musteri newMusteri);
}
