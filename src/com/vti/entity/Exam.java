package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	public int ExamID;
	public int Code;
	public String Title;
	public CategoryQuestion CategoryID;
	public int duration;
	public Account CreatorID;
	public Question[] questions;
	public LocalDate createDate;

}
