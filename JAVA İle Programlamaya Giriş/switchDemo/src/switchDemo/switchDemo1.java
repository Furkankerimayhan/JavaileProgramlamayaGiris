package switchDemo;

public class switchDemo1 {

	public static void main(String[] args) {
		char grade = 'b';
		
		switch(grade) {
		case 'A':
			System.out.println("Mukemmel gectiniz");
			break;
		case 'B':
			System.out.println("cok guzel gectiniz");
			break;
		case 'C':
			System.out.println("iyi gectiniz");
			break;
		case 'D':
			System.out.println("Fena degil gectiniz");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
			default:
				System.out.println("Gecersiz not ");
		}

	}

}
