package com.cihan.siparis.service.siparis;

import java.sql.SQLException;
import java.util.List;

import com.cihan.siparis.dto.Siparis;

public interface SiparisService {
	
	public List<Siparis> findAll() throws SQLException;
	public void save(Siparis Siparis) throws SQLException;
	public void update(Siparis Siparis) throws SQLException;
	void delete(Siparis Siparis) throws SQLException;
}
