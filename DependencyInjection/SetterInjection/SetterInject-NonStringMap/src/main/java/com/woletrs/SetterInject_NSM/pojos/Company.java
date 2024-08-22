package com.woletrs.SetterInject_NSM.pojos;

import java.util.Map;

public class Company {
	private Map<Employee, Address> employees;

	public Map<Employee, Address> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<Employee, Address> employees) {
		this.employees = employees;
	}

	public void display() {
		for (Map.Entry<Employee, Address> entry : employees.entrySet()) {
			System.out.println(
					"Employee Data ->" + entry.getKey().toString() 
					+ " Address ->" + entry.getValue().toString());
		}
	}
}











