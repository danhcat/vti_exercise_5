package com.vti.entity;

public class Answer {

	public int id;
	public String content;
	public Question QuestionID;
	public boolean isCorrect;

	public void printanswer() {
		System.out.println("id: " + this.id);
		System.out.println("content: " + this.content);
		System.out.println("QuestionID: " + this.QuestionID.id);
		System.out.println("isCorrect: " + this.isCorrect);
	}
}
