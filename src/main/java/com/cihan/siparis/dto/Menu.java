package com.cihan.siparis.dto;

public class Menu {
	int id;
	String name;
	int restoran_id;

	public Menu() {

	}

	public Menu(int id) {
		super();
		this.id = id;
	}

	public Menu(String name, int restoran_id) {
		// super();
		this.name = name;
		this.restoran_id = restoran_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRestoran_id() {
		return restoran_id;
	}

	public void setRestoran_id(int restoran_id) {
		this.restoran_id = restoran_id;
	}

}
