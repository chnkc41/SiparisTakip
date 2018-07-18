//package com.cihan.siparis.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.GeneratedValue;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "siparismenu")
//public class SiparisMenu {
//
//	@javax.persistence.Id
//	@GeneratedValue // auto-increment
//	int Id;
//
//	@ManyToOne(targetEntity=Siparis.class)
//	@JoinColumn(name = "siparis_id", foreignKey=@ForeignKey(name = "FK_siparis_siparismenu"))
//	Siparis siparis;
//
//	@ManyToOne(targetEntity = Menu.class)
//	@JoinColumn(name = "menu_id", foreignKey=@ForeignKey(name = "FK_siparis_menu"))
//	Menu menu;
//
//	@Column
//	int adet;
//
//	public int getId() {
//		return Id;
//	}
//
//	public void setId(int id) {
//		Id = id;
//	}
//
//	public Siparis getSiparis() {
//		return siparis;
//	}
//
//	public void setSiparis(Siparis siparis) {
//		this.siparis = siparis;
//	}
//
//	public Menu getMenu() {
//		return menu;
//	}
//
//	public void setMenu(Menu menu) {
//		this.menu = menu;
//	}
//
//	public int getAdet() {
//		return adet;
//	}
//
//	public void setAdet(int adet) {
//		this.adet = adet;
//	}
//
//}
