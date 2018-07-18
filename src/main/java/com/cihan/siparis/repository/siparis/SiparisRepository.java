package com.cihan.siparis.repository.siparis;

import java.sql.SQLException;
import java.util.List;

import com.cihan.siparis.dto.Siparis;

public interface SiparisRepository {
	public List<Siparis> findAll() throws SQLException;

	public void save(Siparis siparis) throws SQLException;

	public void update(Siparis siparis) throws SQLException;

	void delete(Siparis siparis) throws SQLException;
}
