package throwDemo;

public class BalanceInsufficentException extends Exception{  //bunun bir exception olabilmesi için extends ettik
	String message;
	public BalanceInsufficentException(String message) {
		this.message = message;
		
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}
