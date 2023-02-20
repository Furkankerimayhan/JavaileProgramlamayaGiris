package polymorphismDemo;

public class CustomerManager {
	private BaseLogger Logger;
	
	public CustomerManager(BaseLogger logger) {
		this.Logger = logger;
	}
	public void add() {
		System.out.println("Musteri eklendi");
		this.Logger.log("log mesaji");
	}
}
