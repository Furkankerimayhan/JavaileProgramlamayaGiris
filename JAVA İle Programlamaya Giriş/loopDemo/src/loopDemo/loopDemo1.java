package loopDemo;

import java.util.Iterator;

public class loopDemo1 {

	public static void main(String[] args) {
		for(int i = 1;i<=10;i++) { //i++ i yi bir arttır demek
			System.out.println(i);
		}
		for(int i = 1;i<=10;i+=2) { //i+=2 ise 2 arttır demek buda bize tek sayıları verir
			System.out.println(i);
		}
		for(int i = 2;i<=10;i+=2) { //i yi 2 yaparsak buda bize çift sayıları verir
			System.out.println(i);
		}
		//While
		
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++; //bir bir arrtırmak veya tek veya çift sayılar için while döngüsünde buraya yazıyoruz
			     //aynı zamanda döngüyü sonsuz döngüden kutarıyoruz
		}
		System.out.println("While dongusu bitti");
		
		//Do-While döngüsü
		int j=100;           //while ile do-while arasındaki fark while döngüsünde hata varken çalışmasa bile
		do {                 //do-while döngüsünde en az bir kere çalışır
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("do-while döngüsü bitti");
	
	}
	

}
