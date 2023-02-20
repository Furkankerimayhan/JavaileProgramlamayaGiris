package arrayListDemo;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		
		sayilar.add(10);      //eleman eklmek için
		sayilar.add(1);
		sayilar.add("Ankara");
		//System.out.println(sayilar.size()); //kaç eleman olduğunu verir
		//sayilar.set(2, 100);  //mesela burada 2. indexteki elemanı "100" olarak değiştirdik
		//System.out.println(sayilar.get(2));  //aradağımız indexteki elemanı verir
		//sayilar.remove(0);   //listedeki bir elemanı silmek istediğimizde
		//sayilar.clear();  //bütün listeyi silmek için
		//System.out.println(sayilar.get(0));  
		
		for (Object i:sayilar) {     //listeyi gezdik
			System.out.println(i);
		}
		
	}
}
