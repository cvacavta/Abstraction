package fullabstracttwointerface;

public class Desktop implements Hardware, Software{

	@Override
	public void hadwareResources() {
		System.out.println("This is Hardware");
		
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.softwareResources();
		d.hadwareResources();
	}
	@Override
	public void softwareResources() {
		System.out.println("This is Software");		
	}
	
}
