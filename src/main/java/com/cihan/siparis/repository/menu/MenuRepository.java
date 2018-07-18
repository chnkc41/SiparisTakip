package com.cihan.siparis.repository.menu;

import java.sql.SQLException;
import java.util.List;

import com.cihan.siparis.dto.Menu;

public interface MenuRepository {
	public List<Menu> findAll() throws SQLException;
	public void save(Menu newMenu) throws SQLException;
	public void update(Menu Menu) throws SQLException;
	void delete(Menu Menu);
		
}
