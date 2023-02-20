package mukemmelsayii;

public class mukemmelSayii {

	public static void main(String[] args) {
		//kendinden başka pozitif tüm tam bölenlerin sayısı kendisine eşit olan toplamı kendisine eşit olan sayıya mükemmel sayı denir
		int number = 6;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
			
		}
		if(total == number) {
			System.out.println("Mukemmel sayıdır.");
		}else {
			System.out.println("Mukemmel sayi degıldır.");
		}

	}

}
