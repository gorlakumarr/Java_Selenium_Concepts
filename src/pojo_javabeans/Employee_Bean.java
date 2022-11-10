package pojo_javabeans;

import java.io.Serializable;

public class Employee_Bean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int empId;
	private String name;
	private double salary;

	public Employee_Bean() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
