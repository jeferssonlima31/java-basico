package entities;

public class EmployeeListEx {
	private Integer id;
	private String name;
	private Double salary;
	// CLASS WITH ALL METHODOS, CONSTRUCTOS, ATTRIBUTE AND A OUT FORMAT TO CLASS
	public EmployeeListEx(Integer id, String name, Double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increase(double porcent) {
		salary += salary * porcent / 100;
	}

	@Override
	public String toString() {
		return "ID :" + getId() + ", Name: " + getName() + ", Salary: " + String.format("%.2f",getSalary());
	}
	
}
