package com.vti.frontend;

import com.vti.entity.Student;

public class demo1 {

	public static void main(String[] args) {
// public dùng được mọi nơi trong chương trình

		Student s1 = new Student();
		s1.id = 1;
		s1.name = "danhcat";
		System.out.println("id: " + s1.id);
	}
}
