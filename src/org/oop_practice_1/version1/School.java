package org.oop_practice_1.version1;

import java.util.ArrayList;
import java.util.List;
/*
 * A school has teachers, students and fees etc, so we add these classes to the class school, itself.
 */

/*
 * An Arraylist can be used to implement a dynamic array, that can expand and contract in size. 
 */
public class School {
	
	private List<teachers> teacher;
	private List<student> students;
	private int total_outgoing;
	private int total_incoming;
	
	//Constructor, we ignore the input for money in and out, and initialize to 0.
	
	public School(List<teachers> teacher, List<student> students) {
		super();
		this.teacher = teacher;
		this.students = students;
		this.total_outgoing = 0;
		this.total_incoming = 0;
	}

	public List<teachers> getTeacher() {//returns a list of teachers in the school
		return teacher;
	}

	public void updateTeacher(teachers teacher) {//Changed setTeacher to updateTeacher, 
		teachers.add(teacher);
	}

	public List<student> getStudents() {//returns list of students in the school
		return students;
	}

	public void addStudent(student students) {
		student.add(students);
	}

	public int getTotal_outgoing() {
		return total_outgoing;
	}

	public void update_outgoing(int outgoing) {
		total_outgoing += outgoing;
	}

	public int getTotal_incoming() {
		return total_incoming;
	}

	public void update_incoming(int incoming) {
		total_incoming += incoming;
	}
	//1:10 hrs
	//
}
