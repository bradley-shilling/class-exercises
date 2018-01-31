package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	/*
	 * Test for these things:
	 * is the annual salary correct after receiving a raise?
	 * is it possible to give a non-negative raise amount?
	 * 
	 * Employee(int employeeId, String firstName, String lastName, double salary)
	 */
	
	/*
	 * Instance varible subject unit to test
	 */
	private Employee employee;
	
	/*
	 * set up test
	 */
	@Before
	public void setUp() throws Exception {
		employee = new Employee(1007,"first","last",10000);
		employee.setDepartment("department");
	}

	@Test
	public void testEmployee() {
		assertNotNull(employee);
	}

	@Test
	public void testGetEmployeeId() {
		assertEquals(1007, employee.getEmployeeId()); 
	}

	@Test
	public void testFirstName() {
		assertEquals("first", employee.FirstName());
	}

	@Test
	public void testLastName() {
		assertEquals("last", employee.LastName());
	}

	@Test
	public void testFullName() {
		assertEquals("last, first", employee.LastName() + ", " + employee.FirstName());
	}

	@Test
	public void testGetDepartment() {
		assertEquals("department", employee.getDepartment());
	}

	@Test
	public void testSetDepartment() {
		employee.setDepartment("new Department");
		assertEquals("new Department", employee.getDepartment());
	}

	@Test
	public void testGetAnnualSalary() {
		assertEquals(10000, employee.getAnnualSalary(), 0.001);
	}

	/*
	 * is the annual salary correct after receiving a raise?
	 */
	@Test
	public void testRaiseSalary() {
		employee.RaiseSalary(5);
		assertEquals(10500, employee.getAnnualSalary(), 0.001);
	}


}
