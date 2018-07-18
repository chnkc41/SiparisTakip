package com.cihan.siparis.dto;

public class SiparisMenu {

	int id;
	int adet;
	int menu_id;
	int siparis_id;

	public SiparisMenu() {
		// super();
	}

	public SiparisMenu(int id) {
		this.id = id;
	}

	public SiparisMenu(int adet, int menu_id, int siparis_id) {
		// super();
		this.adet = adet;
		this.menu_id = menu_id;
		this.siparis_id = siparis_id;
	}

	public SiparisMenu(int id, int adet, int menu_id, int siparis_id) {
		// super();
		this.id = id;
		this.adet = adet;
		this.menu_id = menu_id;
		this.siparis_id = siparis_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public int getSiparis_id() {
		return siparis_id;
	}

	public void setSiparis_id(int siparis_id) {
		this.siparis_id = siparis_id;
	}

}
