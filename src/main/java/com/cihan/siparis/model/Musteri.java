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
//@Table(name = "musteri")
//public class Musteri {
//
//	@javax.persistence.Id
//	@GeneratedValue
//	int Id;
//
//	@Column
//	String name;
//
//	@Column
//	String mail;
//
//	@Column
//	String pass;
//	
//	@OneToMany(mappedBy = "musteri")
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
//	public String getMail() {
//		return mail;
//	}
//
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
//
//	public String getPass() {
//		return pass;
//	}
//
//	public void setPass(String pass) {
//		this.pass = pass;
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
