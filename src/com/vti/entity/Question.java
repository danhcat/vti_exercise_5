package com.vti.entity;

import java.time.LocalDate;

public class Question {

	public int id;
	public String content;
	public CategoryQuestion Categoryid;
	public TypeQuestion TypeID;
	public Account CreatorID;
	public LocalDate createDate;
	public Exam[] exams;

	public void printquestion() {
		System.out.println("id: " + this.id);
		System.out.println("content: " + this.content);
		System.out.println("TypeID: " + this.TypeID.typeID);
		System.out.println("CreatorID: " + this.CreatorID.id);
		System.out.println("createDate: " + this.createDate);
		System.out.println("exams: ");

	}
}
