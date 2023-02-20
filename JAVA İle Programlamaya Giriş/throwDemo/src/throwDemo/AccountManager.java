package throwDemo;

public class AccountManager {
	private double balance;
	
	public void deposit(double amount) {
		balance = getBalance() + amount; //hesap + yatırılan para
		
	}
	public void withdraw(double amount) throws BalanceInsufficentException {
		if(balance>=amount) {
			balance = getBalance() - amount;  //çekilen para
		}else {
			throw new BalanceInsufficentException("Bakiye yetersizdir"); //kendi exception ımızı yazdık
		}
		
	}
	public double getBalance() {  //hesaptaki kalan para
		return balance;
	}
	
	
}
