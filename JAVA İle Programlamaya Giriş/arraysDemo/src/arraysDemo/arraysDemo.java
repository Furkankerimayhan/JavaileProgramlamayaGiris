package arraysDemo;

public class arraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Furkan";
		String ogrenci2 = "Sena";
		String ogrenci3 = "Pırtık";
		String ogrenci4 = "Ayhan";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------");
		
		String[] ogrenciler = new String[3]; //Yukarıdaki gibi yaparsak güncellemek ve yeni isim eklemek 
		ogrenciler[0]="Furkan";              //çok uğraştıracak ama burada daha kolaydır
		ogrenciler[1]="Sena";
		ogrenciler[2]="Pırtık";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
			
			
		}
		System.out.println("--------------");  //yukarıdaki for döngüsü yerine buradaki for döngüsü kullanılabilir
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}	
	}

}
