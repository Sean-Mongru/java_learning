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
}
//38:06