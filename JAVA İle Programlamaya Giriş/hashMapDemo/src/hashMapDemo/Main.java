package hashMapDemo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("Book", "Kitap");  //eklemek için
		sozluk.put("Table", "Masa");
		sozluk.put("Computer", "Bilgisayar");
		System.out.println(sozluk.size()); //eleman sayısı
		
		for(String item: sozluk.keySet()) {
			System.out.println("Eleman-"+item+" Deger-"+sozluk.get(item));
		}
		
		
		sozluk.remove("Table");   //silmek için
		sozluk.clear(); //bütün elemanları siler
		
		
		System.out.println(sozluk.get("Table"));
	}

}
