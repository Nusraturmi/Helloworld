package hrm.pmis;

public class Employee extends Person{
	private int id, salary;
	private String designation;
	
	public Employee() {
		System.out.println("Employee is created");
	}
	
	public Employee (int id, String name,int emid, int salary, String designation) {
		super(id, name);
		this.id = emid;
		this.salary = salary;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int emid) {
		this.id = emid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	
	

}
