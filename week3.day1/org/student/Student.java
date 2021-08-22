package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Student name");
	}
	
	public void studentDept()
	{
		System.out.println("student dept");
	}
	
	public void studentId()
	{
		System.out.println("student id");
	}
	
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		
	}
}
