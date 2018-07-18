package com.cihan.siparis.repository.menu;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.knowm.yank.Yank;
import org.springframework.stereotype.Repository;

import com.cihan.siparis.dto.Menu;

@Repository
public class MenuRepositoryYankImpl implements MenuRepository {

	@Override
	public List<Menu> findAll() throws SQLException {
		String query = "select id, name, restoran_id from Menu";
		return Yank.queryBeanList(query, Menu.class, null);
	}

	@Override
	public void save(Menu newMenu) throws SQLException {
		String query = "insert into Menu(name, restoran_id) values (?, ?)";
		Yank.execute(query, new Object[] { newMenu.getName(), newMenu.getRestoran_id() });

	}

	@Override
	public void update(Menu Menu) throws SQLException {
		String query = "update Menu set name = ?, restoran_id = ?";
		Yank.execute(query, new Object[] { Menu.getName(), Menu.getRestoran_id() });
	}

	@Override
	public void delete(Menu Menu) {
		String query = "delete from Menu where id = ?";
		Yank.execute(query, new Object[] {Menu.getId() });
		
		//return Yank.queryBeanList(query, Menu.class, null);

	}

	public static void main(String[] args) throws SQLException {
		Properties dbProps = new Properties();
		dbProps.setProperty("jdbcUrl", "jdbc:mysql://localhost:3308/siparistakip");
		dbProps.setProperty("username", "siparistakip");
		dbProps.setProperty("password", "1234");

		// setup connection pool
		Yank.setupDefaultConnectionPool(dbProps);
		MenuRepositoryYankImpl repository = new MenuRepositoryYankImpl();

		//repository.save(new Menu("menu3",1));
		//repository.update(new Menu("menu-update", 1));
		repository.delete(new Menu(2));

	}

}
