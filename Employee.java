package employee1;

public class Employee {
	String Fname;
	String Lname;
	int id;
	int salary;
	String Name;
	
	public String getName() {
		return this.Fname+this.Lname;
	}
	public void setName(String name) {
		Name = name;
	}
	public Employee(String fname, String lname, int id, int salary) {
		super();
		Fname = fname;
		Lname = lname;
		this.id = id;
		this.salary = salary;
		AnnualSalary();
		FSalary();
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	@Override
	public String toString() {
		return "Employee [Id:" + id + ", Name:" + getName() + ", Salary:" + FSalary() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int AnnualSalary() {
		int c=12*this.salary;
		return c;
		
	}
	
	public int FSalary() {
		int d=this.AnnualSalary()*12;
		return d;
		
	}
	


}
