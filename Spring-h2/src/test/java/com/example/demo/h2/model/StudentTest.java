package com.example.demo.h2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class StudentTest {
	
	Student student;
	
	@BeforeEach
	public void setup() {
		student = new Student();
	}
	
	@Test
	void getId() throws Exception{
		int idVal=1;
		student.setId(idVal);
		assertEquals(idVal, student.getId() );
	}
	
	 @Test
	    void getName() throws Exception{
	        String nameValue = "Electronics";
	        student.setName(nameValue);
	        assertEquals(nameValue, student.getName());
	    }
	 
	 @Test
	    void getAge() throws Exception{
	        String departmentvalue = "King";
	        student.setDepartment(departmentvalue);
	        assertEquals(departmentvalue, student.getDepartment());
	    }
	
	 
	

}
