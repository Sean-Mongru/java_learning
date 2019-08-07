package org.oop_practice_1.version1;

public class student{
	/*
	 * This class keeps track of student's attributes
	 * id, name, class, fees to be paid, fees paid
	 */
	private int id;//access specifier prevents intruders from accessing the id
	private String name;
	private int grade;
	private double fees_paid;
	private double fees_total;
	
	/*
	 * student id - unique value
	 * student name - unique string
	 * student grade - (technically) unique grade
	 * Fees = $30000 total and inital paid is $0
	 */
	
	public student(int id, String name, int grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.fees_paid = 0;//initialize feez using "this."
		this.fees_total = 30000;
	}
	/*
	 * We are not going to alter the student's name or id, these remain constant,
	 *  so upon initializing the variable, we put the name/id one time
	 */
	//setter - set grade, used for updating student's grade
	public void setgrade(int grade) {
		this.grade=grade;
	}
	
	public void update_fees(int fees) {
		this.fees_paid += fees;
		this.fees_total -= fees;
	}
	
	/*
	 * Getters for the 5 fields we have
	 */
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public double getFees_paid() {
		return fees_paid;
	}
	public double getFees_total() {
		return fees_total;
	}
	public static void add(student students) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
