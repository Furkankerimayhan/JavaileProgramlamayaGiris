package classes;

public class classes {

	public static void main(String[] args) {
		//classlar referans türdür.
		CustomerManager customerManager = new CustomerManager(); 
		CustomerManager customerManager2 = new CustomerManager(); 
		customerManager = customerManager2; 
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi1 = 30;
		System.out.println(sayi2);   //cevap 10 
		
		int[] sayilar1 = new int[] {1,2,3};   //sayılar referans tiptir
		int[] sayilar2 = new int[] {4,5,6};   
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);  //cevap 10
	}
}