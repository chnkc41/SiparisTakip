package com.cihan.siparis.dto;

public class Musteri {
	int id;
	String mail;
	String name;
	String pass;

	public Musteri() {

	}

	public Musteri(int id) {
		this.id = id;

	}

	public Musteri(String mail, String name, String pass) {
		this.mail = mail;
		this.name = name;
		this.pass = pass;
	}

	public Musteri(int id, String mail, String name, String pass) {
		this.id = id;
		this.mail = mail;
		this.name = name;
		this.pass = pass;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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
