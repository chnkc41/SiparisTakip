//package com.cihan.siparis.service.siparismenu;
//
//import java.sql.SQLException;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import com.cihan.siparis.dto.SiparisMenu;
//import com.cihan.siparis.repository.siparismenu.SiparisMenuRepository;
//
//@Service
//public class SiparisMenuServiceImpl implements SiparisMenuService {
//
//	private static final Logger LOG = LoggerFactory.getLogger(SiparisMenuServiceImpl.class);
//
//	@Autowired
//	@Qualifier("SiparisMenuRepositoryYankImpl")
//	SiparisMenuRepository repository;
//
//	@Override
//	public List<SiparisMenu> findAll() {
//		try {
//			return repository.findAll();
//		} catch (SQLException e) {
//			LOG.error("Siparis listelenemedi", e);
//			throw new RuntimeException("Siparisler listelenemedi, hata:" + e.toString());
//		}
//	}
//
//	@Override
//	public void save(SiparisMenu SiparisMenu) {
//		try {
//			repository.save(SiparisMenu);
//		} catch (SQLException e) {
//			LOG.error("Siparis kaydedilemedi", e);
//			throw new RuntimeException("Siparis kaydedilemedi, hata:" + e.toString());
//		}
//
//	}
//
//}
