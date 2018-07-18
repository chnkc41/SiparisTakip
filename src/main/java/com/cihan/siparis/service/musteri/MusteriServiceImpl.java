package com.cihan.siparis.service.musteri;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cihan.siparis.dto.Musteri;
import com.cihan.siparis.repository.musteri.MusteriRepository;

@Service
public class MusteriServiceImpl implements MusteriService{

	private static final Logger LOG = LoggerFactory.getLogger(MusteriServiceImpl.class);
	
	@Autowired
	@Qualifier("musteriRepositoryYankImpl")
	MusteriRepository repository;
	
	@Override
	public List<Musteri> findAll() {
		try {
			return repository.findAll();
		} catch (SQLException e) {
			LOG.error("Musteriler listelenemedi", e);
			throw new RuntimeException("Musteriler listelenemedi, hata:" + e.toString());
		}
	}

	@Override
	public void save(Musteri newMusteri) {
		try {
			repository.save(newMusteri);
		} catch (SQLException e) {
			LOG.error("Musteri kaydedilemedi", e);
			throw new RuntimeException("Musteriler kaydedilemedi, hata:" + e.toString());
		}
	}



}
