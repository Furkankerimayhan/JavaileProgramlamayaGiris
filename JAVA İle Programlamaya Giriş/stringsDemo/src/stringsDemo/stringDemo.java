package stringsDemo;

public class stringDemo {

	public static void main(String[] args) {
		String mesaj = "    Bugun hava cok guzel.    ";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman Sayisi : "+mesaj.length());
		System.out.println("5.Eleman : "+mesaj.charAt(4));  //yazılan harfi veya elemanı bulmak için
		System.out.println(mesaj.concat(" Yasasin!")); //ekleme yapıyoruz
		System.out.println(mesaj.startsWith("B"));  //girilen harf ile başlıyorsa true değilse false döndürür
		System.out.println(mesaj.endsWith("."));  //girilen harf ile bitiyor sa true değilse false
		char[] karakter = new char[5];  //char ereği oluşturmamız gerekiyordu aşağısı için
		mesaj.getChars(0, 5, karakter, 0); //0. indexten 4.index e kadar yazar bir fazla yazmak gerekiyor
		System.out.println(karakter);
		System.out.println(mesaj.indexOf('a')); //yazılanm harf kaçıncı indexte olduğunu gösterir sadec ilkini
		System.out.println(mesaj.lastIndexOf("a")); //sondan başlayarak kaçıncı indecte olduğunu verir*/
		
		System.out.println(mesaj.replace(' ', '-'));  //değiştirmek istediğimiz yerlerin yerine değiştirilecek olan yazılır
		System.out.println(mesaj.substring(2));  //mesajın 2. indexinden sonra kes
		System.out.println(mesaj.substring(2, 4));  //mesajın 2. indexinden öncesini ve 4. indexsinden sonrasını kes
		
		for(String kelime : mesaj.split(" ")) {  //kelimeleri ayırır
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase()); //bütün harfleri küçültür.
		System.out.println(mesaj.toUpperCase()); //bütün harfleri büyültür.
		System.out.println(mesaj.trim());   //başındaki ve sonundaki boşlukları siler
		
	}

}
