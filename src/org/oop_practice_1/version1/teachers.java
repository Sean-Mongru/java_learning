package org.oop_practice_1.version1;
/*
 * Tracks Teachers - name, id, salary
 */
public class teachers {
	private String id;
	private String name;
	private int salary;
	
	public void teacher(String id, String name, int salary) {//This is a constructor
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	/*
	 * Getters for the project, returns the respective fields for the teacher class
	 */
	public String getName(){
		return name;
	}
	public String getid() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
}
//38:06