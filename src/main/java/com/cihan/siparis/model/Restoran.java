//package com.cihan.siparis.model;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "restoran")
//public class Restoran {
//
//	@javax.persistence.Id
//	@GeneratedValue
//	int Id;
//
//	@Column
//	String name;
//
//	@OneToMany(mappedBy = "restoran")
//	List<Menu> menuler;
//
//	@OneToMany(mappedBy = "restoran")
//	List<Siparis> siparisler;
//	
//	public int getId() {
//		return Id;
//	}
//
//	public void setId(int id) {
//		Id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public List<Menu> getMenuler() {
//		return menuler;
//	}
//
//	public void setMenuler(List<Menu> menuler) {
//		this.menuler = menuler;
//	}
//
//	public List<Siparis> getSiparisler() {
//		return siparisler;
//	}
//
//	public void setSiparisler(List<Siparis> siparisler) {
//		this.siparisler = siparisler;
//	}
//
//}
