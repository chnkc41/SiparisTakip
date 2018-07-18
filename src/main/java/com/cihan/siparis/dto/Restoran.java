package com.cihan.siparis.dto;

public class Restoran {
	int id;
	String name;

	public Restoran() {

	}

	public Restoran(int id) { // for delete
		this.id = id;
	}

	public Restoran(String name) { // for save
		this.name = name;
	}

	public Restoran(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
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

}
