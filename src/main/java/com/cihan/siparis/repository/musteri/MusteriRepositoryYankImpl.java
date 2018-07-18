package com.cihan.siparis.repository.musteri;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.knowm.yank.Yank;
import org.springframework.stereotype.Repository;

import com.cihan.siparis.dto.Musteri;

@Repository
public class MusteriRepositoryYankImpl implements MusteriRepository {

	@Override
	public List<Musteri> findAll() throws SQLException {
		String query = "select id, mail, name, pass from Musteri";
		return Yank.queryBeanList(query, Musteri.class, null);
	}

	@Override
	public void save(Musteri newMusteri) throws SQLException {
		String query = "insert into Musteri(id, mail, name, pass) values (?, ?, ?, ?)";
		Yank.execute(query, new Object[] { newMusteri.getId(), newMusteri.getMail(), newMusteri.getName(), newMusteri.getPass() });
		
	}
	
	@Override
	public void update(Musteri Musteri) throws SQLException {
		String query = "update Musteri set mail = ?, name = ?, pass = ? where id = ?";
		Yank.execute(query, new Object[] { Musteri.getMail(), Musteri.getName(), Musteri.getPass(), Musteri.getId() });
		
	}
	@Override
	public void delete(Musteri Musteri) throws SQLException {
		String query = "delete from Musteri where id = ?";
		Yank.execute(query, new Object[] {Musteri.getId() });
		
	}
	
	
	
	public static void main(String[] args) throws SQLException {
		Properties dbProps = new Properties();
		dbProps.setProperty("jdbcUrl", "jdbc:mysql://localhost:3308/siparistakip");
		dbProps.setProperty("username", "siparistakip");
		dbProps.setProperty("password", "1234");

		// setup connection pool
		Yank.setupDefaultConnectionPool(dbProps);
		MusteriRepositoryYankImpl repository = new MusteriRepositoryYankImpl();

		repository.save(new Musteri("xxx@gmail.com","xxx","12345"));
		//repository.update(new Musteri(11,"deneme@gmail.com","deneme","123"));
		//repository.delete(new Musteri(8));

	}




}
