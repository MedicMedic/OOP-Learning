package com.oop.cs2.techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.oop.cs2.domain.Student;

public class StudentDA 
{
	private ArrayList<Student> studentList;
	
	public StudentDA() throws FileNotFoundException
	{
		Scanner studentInfo = new Scanner(
				new FileReader("../OOP_2CS2/src/studentInfo.csv"));
		studentList = new ArrayList<Student>();
		
		while(studentInfo.hasNext())
		{
			String rowStudent = new String();
			rowStudent = studentInfo.nextLine();
			
			String[] rowStudentSpecific = new String[4];
			rowStudentSpecific = rowStudent.split(",");
			
			Student student = new Student();
			
			student.setStudentNumber(rowStudentSpecific[1].trim());
			student.setName(rowStudentSpecific[2].trim());
			student.setProgram(rowStudentSpecific[3].trim());
			
			CourseDA courseDA = new CourseDA(student.getStudentNumber());
			
			student.setCourseList(courseDA.getCourseList());
			
			studentList.add(student);
		}
		studentInfo.close();
	}
	
	public ArrayList<Student> getStudentList()
	{
		return studentList;
	}
}
