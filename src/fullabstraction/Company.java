package fullabstraction;

public class Company implements Employee{

	public void empName() {
		System.out.println("Emp Name is SIVA");
	}
	public void empID() {
		System.out.println("Emp ID is 9816");
	}
	public void empAge() {
		System.out.println("Emp Age is 30");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.empName();
		c.empID();
		c.empAge();
	}
}
