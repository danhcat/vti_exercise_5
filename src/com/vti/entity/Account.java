package com.vti.entity;

import java.time.LocalDate;

import javax.swing.GroupLayout.Group;

public class Account {

	public int id;
	public String username;
	public String email;
	public String fullname;
//	public Deparment deparment;
//	public position position;
	public LocalDate createDate;
	public Group[] groups;

	public Account(int id, String username, String email, String fullname, LocalDate createDate, Group[] groups) {

		this.id = id;
		this.username = username;
		this.email = email;
		this.fullname = fullname;
//		this.deparment = deparment;
//		this.position = position;
		this.createDate = createDate;
		this.groups = groups;
	}

	public void prinaccount() {
		System.out.println("id: " + this.id);
		System.out.println("email: " + this.email);
		System.out.println("fullname: " + this.fullname);
//		System.out.println("deparment: " + this.deparment.id);
//		System.out.println("position: " + this.position.id);
		System.out.println("createDate: " + this.createDate);
		System.out.println("groups: " + this.groups);

	}

}
