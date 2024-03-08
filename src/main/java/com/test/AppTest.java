package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class AppTest {

	public static void main(String[] args) {
		// Normal java object creation
		Student s = new Student();
		s.setName("Nayan");
	    System.out.println(s.getName());
	    System.out.println("Hashcode value of s obj : " + s.hashCode());
	    
	    System.out.println();
	    
	    Student s1 = new Student();
	    System.out.println(s1.getName());
	    System.out.println("Hashcode value of s1 obj : " + s1.hashCode());
	    
	    System.out.println();
	    System.out.println("With spring object creation ===> ");
	    System.out.println();
	    
	    // with spring object creation
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	    Student student = (Student) ctx.getBean("stu");
	    System.out.println(student.getName());
	    System.out.println(student.getAge());
	    System.out.println(student.getAddress().getLandmark());
	    System.out.println(student.hashCode());
	    System.out.println();
	    Student student1 = (Student) ctx.getBean("stu");
	    System.out.println(student1.getName());
	    System.out.println(student1.getAge());
	    System.out.println(student1.hashCode());
	    System.out.println();

	    Student student2 = (Student) ctx.getBean("stu");
	    
	    System.out.println(student2.getName());
	    System.out.println(student2.getAge());
	    System.out.println(student2.hashCode());
	    
	    // See the difference between java and spring by running program 
	}
}
