package com.cihan.siparis.dto;

public class Siparis {
	int id;
	int musteri_id;
	int restoran_id;

	public Siparis() {

	}

	public Siparis(int musteri_id, int restoran_id) { // save

		this.musteri_id = musteri_id;
		this.restoran_id = restoran_id;
	}

	public Siparis(int id, int musteri_id, int restoran_id) { // update 
		this.id = id;
		this.musteri_id = musteri_id;
		this.restoran_id = restoran_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMusteri_id() {
		return musteri_id;
	}

	public void setMusteri_id(int musteri_id) {
		this.musteri_id = musteri_id;
	}

	public int getRestoran_id() {
		return restoran_id;
	}

	public void setRestoran_id(int restoran_id) {
		this.restoran_id = restoran_id;
	}

}
