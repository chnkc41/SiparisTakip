//package com.cihan.siparis.model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "siparis")
//public class Siparis {
//
//	@javax.persistence.Id
//	@GeneratedValue // auto-increment
//	int Id;
//
//	@ManyToOne
//	Restoran restoran;
//
//	@ManyToOne
//	Musteri musteri;
//
//	@OneToMany(targetEntity=SiparisMenu.class, mappedBy = "siparis")
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
//	public Restoran getRestoran() {
//		return restoran;
//	}
//
//	public void setRestoran(Restoran restoran) {
//		this.restoran = restoran;
//	}
//
//	public Musteri getMusteri() {
//		return musteri;
//	}
//
//	public void setMusteri(Musteri musteri) {
//		this.musteri = musteri;
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
