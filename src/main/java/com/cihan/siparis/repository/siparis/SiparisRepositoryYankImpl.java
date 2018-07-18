package com.cihan.siparis.repository.siparis;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.knowm.yank.Yank;
import org.springframework.stereotype.Repository;

import com.cihan.siparis.dto.Siparis;

@Repository
public class SiparisRepositoryYankImpl implements SiparisRepository {

	@Override
	public List<Siparis> findAll() throws SQLException {
		String query = "select id, musteri_id, restoran_id from Siparis";
		return Yank.queryBeanList(query, Siparis.class, null);
	}

	@Override
	public void save(Siparis Siparis) throws SQLException {
		String query = "insert into Siparis(musteri_id, restoran_id) values (?, ?)";
		Yank.execute(query, new Object[] { Siparis.getMusteri_id(), Siparis.getRestoran_id()});

	}

	@Override
	public void update(Siparis Siparis) throws SQLException {
		String query = "update Siparis set musteri_id = ?, restoran_id = ? where id = ?";
		Yank.execute(query, new Object[] { Siparis.getMusteri_id(), Siparis.getRestoran_id(), Siparis.getId() });
	}

	@Override
	public void delete(Siparis Siparis) {
		String query = "delete from Siparis where id = ?";
		Yank.execute(query, new Object[] {Siparis.getId() });
		
		//return Yank.queryBeanList(query, Siparis.class, null);

	}

	public static void main(String[] args) throws SQLException {
		Properties dbProps = new Properties();
		dbProps.setProperty("jdbcUrl", "jdbc:mysql://localhost:3308/siparistakip");
		dbProps.setProperty("username", "siparistakip");
		dbProps.setProperty("password", "1234");

		// setup connection pool
		Yank.setupDefaultConnectionPool(dbProps);
		SiparisRepositoryYankImpl repository = new SiparisRepositoryYankImpl();

		//repository.save(new Siparis(2,1));
		repository.update(new Siparis(2, 5, 6));
		//repository.delete(new Siparis(2));

	}

}
