//package com.cihan.siparis.repository.musteri;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.cihan.siparis.ConnectionManager;
//import com.cihan.siparis.dto.Musteri;
//
//@Repository
//public class MusteriRepositoryJdbsImpl implements MusteriRepository {
//
//	@Override
//	public List<Musteri> findAll() throws SQLException {
//		try (Connection conn = ConnectionManager.getConnection()) {
//			String query = "select id, mail, name, pass from Musteri";
//			PreparedStatement ps = conn.prepareStatement(query);
//			
//			try (ResultSet rs = ps.executeQuery()) {
//
//				List<Musteri> result = new ArrayList<>();
//				
//				while (rs.next()) {
//					Musteri musteri = new Musteri();
//
//					musteri.setId(rs.getInt("id"));
//					musteri.setMail(rs.getString("mail"));
//					musteri.setName(rs.getString("name"));
//					musteri.setPass(rs.getString("pass"));
//
//					result.add(musteri);
//				}
//				return result;
//			}
//			
//		}
//	
//	}
//
//	@Override
//	public void save(Musteri newMusteri) throws SQLException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void update(Musteri Musteri) throws SQLException {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
