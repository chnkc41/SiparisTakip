package com.cihan.siparis.repository.siparismenu;

import java.sql.SQLException;
import java.util.List;

import com.cihan.siparis.dto.SiparisMenu;

public interface SiparisMenuRepository {
	public List<SiparisMenu> findAll() throws SQLException;

	public void save(SiparisMenu siparismenu) throws SQLException;

	public void update(SiparisMenu siparismenu) throws SQLException;

	void delete(SiparisMenu siparismenu) throws SQLException;
}
