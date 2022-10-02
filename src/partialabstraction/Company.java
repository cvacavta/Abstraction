package partialabstraction;

public class Company extends Employee{

	public void compID() {
		System.out.println("Company ID is 129723");
	}
	public void empName() {
		System.out.println("Employee Name is SIVA");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.empAge();
		c.empID();
		c.empName();
		c.compID();
	}
}
