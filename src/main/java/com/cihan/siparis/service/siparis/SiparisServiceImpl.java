package com.cihan.siparis.service.siparis;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cihan.siparis.dto.Siparis;
import com.cihan.siparis.repository.siparis.SiparisRepository;

@Service
public class SiparisServiceImpl implements SiparisService {
	
	private static final Logger LOG = LoggerFactory.getLogger(SiparisServiceImpl.class);
	
	@Autowired
	@Qualifier("siparisRepositoryYankImpl")
	SiparisRepository repository;
	
	

	@Override
	public List<Siparis> findAll() {
		try {
			return repository.findAll();
		} catch (SQLException e) {
			LOG.error("Siparis listelenemedi", e);
			throw new RuntimeException("Siparisler listelenemedi, hata:" + e.toString());
		}
	}

	@Override
	public void save(Siparis Siparis) {
		try {
			repository.save(Siparis);
		} catch (SQLException e) {
			LOG.error("Siparis kaydedilemedi", e);
			throw new RuntimeException("Siparis kaydedilemedi, hata:" + e.toString());
		}
		
	}

	@Override
	public void update(Siparis Siparis) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Siparis Siparis) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
