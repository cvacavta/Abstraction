package fullabstract;

public class Ktm implements Bike{

	public void cost() {
		System.out.println("Cost of the Bike is 1.3Cr");
	}
	public void speed() {
		System.out.println("Speed of the bike is 120kmph");
		System.out.println("Speed of the bike is 140kmph");
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}
}
