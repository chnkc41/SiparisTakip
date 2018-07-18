//package com.cihan.siparis.model;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "menu")
//public class Menu {
//
//	@javax.persistence.Id
//	@GeneratedValue  // auto-increment
//	int Id;
//
//	@Column
//	String name;
//
//	@ManyToOne
//	Restoran restoran;
//
//	@OneToMany(targetEntity=SiparisMenu.class, mappedBy = "menu")
//	List<SiparisMenu> sMenuler;
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
//	public Restoran getRestoran() {
//		return restoran;
//	}
//
//	public void setRestoran(Restoran restoran) {
//		this.restoran = restoran;
//	}
//
//	public List<SiparisMenu> getsMenuler() {
//		return sMenuler;
//	}
//
//	public void setsMenuler(List<SiparisMenu> sMenuler) {
//		this.sMenuler = sMenuler;
//	}
//
//}
