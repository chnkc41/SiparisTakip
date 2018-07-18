package com.cihan.siparis.repository.siparismenu;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.knowm.yank.Yank;
import org.springframework.stereotype.Repository;


import com.cihan.siparis.dto.SiparisMenu;

@Repository
public class SiparisMenuRepositoryYankImpl implements SiparisMenuRepository {

	@Override
	public List<SiparisMenu> findAll() throws SQLException {
		String query = "select id, musteri_id, restoran_id from Siparismenu";
		return Yank.queryBeanList(query, SiparisMenu.class, null);
	}

	@Override
	public void save(SiparisMenu SiparisMenu) throws SQLException {
		String query = "insert into SiparisMenu(adet, menu_id, siparis_id) values (?, ?, ?)";
		Yank.execute(query, new Object[] { SiparisMenu.getAdet(), SiparisMenu.getMenu_id(), SiparisMenu.getSiparis_id()});

	}

	@Override
	public void update(SiparisMenu SiparisMenu) throws SQLException {
		String query = "update Siparismenu set adet = ?, menu_id = ?, siparis_id = ? where id = ?";
		Yank.execute(query, new Object[] { SiparisMenu.getAdet(), SiparisMenu.getMenu_id(), SiparisMenu.getSiparis_id(), SiparisMenu.getId() });
	}

	@Override
	public void delete(SiparisMenu SiparisMenu) {
		String query = "delete from Siparismenu where id = ?";
		Yank.execute(query, new Object[] {SiparisMenu.getId() });
		
		//return Yank.queryBeanList(query, Siparis.class, null);

	}

	public static void main(String[] args) throws SQLException {
		Properties dbProps = new Properties();
		dbProps.setProperty("jdbcUrl", "jdbc:mysql://localhost:3308/siparistakip");
		dbProps.setProperty("username", "siparistakip");
		dbProps.setProperty("password", "1234");

		// setup connection pool
		Yank.setupDefaultConnectionPool(dbProps);
		SiparisMenuRepositoryYankImpl repository = new SiparisMenuRepositoryYankImpl();

		//repository.save(new SiparisMenu(1,2,2));
		//repository.update(new SiparisMenu(1, 3, 1,1));
		repository.delete(new SiparisMenu(5));

	}

}
