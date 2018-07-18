package com.cihan.siparis.service.menu;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cihan.siparis.dto.Menu;
import com.cihan.siparis.repository.menu.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {
	
	private static final Logger LOG = LoggerFactory.getLogger(MenuServiceImpl.class);
	
	@Autowired
	@Qualifier("menuRepositoryYankImpl")
	MenuRepository repository;
	
	

	@Override
	public List<Menu> findAll() {
		try {
			return repository.findAll();
		} catch (SQLException e) {
			LOG.error("Menuler listelenemedi", e);
			throw new RuntimeException("Menuler listelenemedi, hata:" + e.toString());
		}
	}

	@Override
	public void save(Menu newMenu) {
		try {
			repository.save(newMenu);
		} catch (SQLException e) {
			LOG.error("Menu kaydedilemedi", e);
			throw new RuntimeException("Menu kaydedilemedi, hata:" + e.toString());
		}
		
	}

	@Override
	public void update(Menu Menu) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Menu Menu) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
