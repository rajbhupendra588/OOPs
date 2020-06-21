package com.example.oops.demo;

public class DataHidingDemo {
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.setId(1);
		e.setName("Bhupendra Singh");

		System.out.println("Name is -> "+e.getName());

		Employee1 e1 = new Employee1("Bhupi",2);
		System.out.println("Name is -> "+e1.getName());

	}
}

//Below class has getter & setter both
class Employee
{
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

//Below class has getter
class Employee1
{
	private String name;
	private int id;

	public Employee1(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}
