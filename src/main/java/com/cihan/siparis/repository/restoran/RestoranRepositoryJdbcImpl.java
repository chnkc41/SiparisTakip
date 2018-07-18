//package com.cihan.siparis.repository.restoran;
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
//import com.cihan.siparis.dto.Restoran;
//
//@Repository
//public class RestoranRepositoryJdbcImpl implements RestoranRepository {
//
//	@Override
//	public List<Restoran> findAll() throws SQLException {
//		try (Connection conn = ConnectionManager.getConnection()) {
//
//			String query = "select id, name from Restoan";
//			PreparedStatement ps = conn.prepareStatement(query);
//
//			try (ResultSet rs = ps.executeQuery()) {
//
//				List<Restoran> result = new ArrayList<>();
//
//				while (rs.next()) {
//					Restoran restoran = new Restoran();
//
//					restoran.setId(rs.getInt("id"));
//					restoran.setName(rs.getString("name"));
//
//					result.add(restoran);
//				}
//
//				return result;
//			}
//		}
//	}
//
//	@Override
//	public void save(Restoran newRestoran) throws SQLException {
//		try (Connection conn = ConnectionManager.getConnection()) {
//
//			String query = "insert into Restoran(id, name) values (?, ?)";
//
//			PreparedStatement ps = conn.prepareStatement(query);
//			ps.setInt(1, newRestoran.getId());
//			ps.setString(2, newRestoran.getName());
//
//			ps.executeUpdate();
//		}
//	}
//
//	public static void main(String[] args) throws SQLException {
//		RestoranRepositoryJdbcImpl repository = new RestoranRepositoryJdbcImpl();
//
//		//repository.save(new Restoran(1, "Restoran1"));
//		repository.update(new Restoran(4, "Restorann2"));
//
//	}
//
//	@Override
//	public void update(Restoran restoran) throws SQLException {
//		try (Connection conn = ConnectionManager.getConnection()) {
//
//			String query = "Update Restoran set name= ? where id = ? ";
//
//			PreparedStatement ps = conn.prepareStatement(query);
//			ps.setString(1, restoran.getName());
//			ps.setInt(2, restoran.getId());
//
//			 ps.executeUpdate();
//		}
//		
//	}
//	
//	
//	
//	
//	
//	
//}
