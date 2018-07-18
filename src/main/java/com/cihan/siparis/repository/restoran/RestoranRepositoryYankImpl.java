package com.cihan.siparis.repository.restoran;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.knowm.yank.Yank;
import org.springframework.stereotype.Repository;

import com.cihan.siparis.dto.Restoran;

@Repository
public class RestoranRepositoryYankImpl implements RestoranRepository {

	@Override
	public Restoran findById(int id) throws SQLException {
		String query = "select id, name from Restoran where id = ?";
		return Yank.queryBean(query, Restoran.class, new Object[] { id });
	}
	
	@Override
	public List<Restoran> findAll() throws SQLException {
		String query = "select id, name from Restoran";
		return Yank.queryBeanList(query, Restoran.class, null);
	}

	@Override
	public int save(Restoran newRestoran) throws SQLException {
		String query = "insert into Restoran(id, name) values (?, ?)";
		Long id = Yank.insert(query, new Object[] { newRestoran.getId(), newRestoran.getName() });
		return id.intValue();
	}

	@Override
	public void update(Restoran Restoran) throws SQLException {
		String query = "update Restoran set name = ? where id = ?";
		Yank.execute(query, new Object[] { Restoran.getName(), Restoran.getId() });

	}

	@Override
	public void delete(Restoran Restoran) {
		String query = "delete from Restoran where id = ?";
		Yank.execute(query, new Object[] {Restoran.getId() });

	}

	public static void main(String[] args) throws SQLException {
		Properties dbProps = new Properties();
		dbProps.setProperty("jdbcUrl", "jdbc:mysql://localhost:3308/siparistakip");
		dbProps.setProperty("username", "siparistakip");
		dbProps.setProperty("password", "1234");

		// setup connection pool
		Yank.setupDefaultConnectionPool(dbProps);
		RestoranRepositoryYankImpl repository = new RestoranRepositoryYankImpl();

		repository.save(new Restoran("Restoran6"));
		//repository.update(new Restoran(3, "Restoran3"));
		//repository.delete(new Restoran(4));
	}

	

}
