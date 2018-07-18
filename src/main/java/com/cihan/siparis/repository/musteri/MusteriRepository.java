package com.cihan.siparis.repository.musteri;

import java.sql.SQLException;
import java.util.List;

import com.cihan.siparis.dto.Musteri;

public interface MusteriRepository {
	public List<Musteri> findAll() throws SQLException;

	public void save(Musteri newMusteri) throws SQLException;

	public void update(Musteri Musteri) throws SQLException;

	public void delete(Musteri Musteri) throws SQLException;

}
