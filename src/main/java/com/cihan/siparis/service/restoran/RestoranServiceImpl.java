package com.cihan.siparis.service.restoran;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cihan.siparis.dto.Restoran;
import com.cihan.siparis.repository.restoran.RestoranRepository;

@Service
public class RestoranServiceImpl implements RestoranService {

	private static final Logger LOG = LoggerFactory.getLogger(RestoranServiceImpl.class);
	
	@Autowired
	@Qualifier("restoranRepositoryYankImpl")
	RestoranRepository repository;
	
	@Override
	public List<Restoran> findAll() {
		try {
			return repository.findAll();
		} catch (SQLException e) {
			LOG.error("Restoranlar listelenemedi", e);
			throw new RuntimeException("Restoranlar listelenemedi, hata:" + e.toString());
		}
	}

	@Override
	public Restoran save(Restoran newRestoran) {
		try {
			int id = repository.save(newRestoran);
			newRestoran.setId(id);
			return newRestoran;
		} catch (SQLException e) {
			LOG.error("Restoran kaydedilemedi", e);
			throw new RuntimeException("Restoranlar kaydedilemedi, hata:" + e.toString());
		}
	}

	@Override
	public void update(Restoran Restoran) {
		try {
			repository.update(Restoran);
		} catch (SQLException e) {
			LOG.error("Restoran update edilmedi", e);
			throw new RuntimeException("Restoran update edilmedi, hata:" + e.toString());
		}
		
	}

	@Override
	public void delete(Restoran Restoran) {
		try {
			repository.delete(Restoran);
		} catch (SQLException e) {
			LOG.error("Restoran silme işlemi gerçekleştirilemedi", e);
			throw new RuntimeException("Restoran silme işlemi gerçekleştirilemedip, hata:" + e.toString());
		}
		
	}

}
