package com.cihan.siparis.repository.restoran;

import java.sql.SQLException;
import java.util.List;

import com.cihan.siparis.dto.Restoran;

public interface RestoranRepository {
	public List<Restoran> findAll() throws SQLException;

	public Restoran findById(int id) throws SQLException;
	
	public int save(Restoran newRestoran) throws SQLException;

	public void update(Restoran Restoran) throws SQLException;

	public void delete(Restoran Restoran) throws SQLException;

}
