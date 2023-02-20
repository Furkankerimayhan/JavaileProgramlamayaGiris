package exceptionHandling;

public class Main {

	public static void main(String[] args) {
		try
		{	
		int[] sayilar = new int[] {1,2,3};
		System.out.println(sayilar[5]);   //burada hata alırsak 
		}catch (StringIndexOutOfBoundsException exception) {    //burası çalışır 
			System.out.println(exception);
		}catch (ArrayIndexOutOfBoundsException exception) {    
			System.out.println(exception);
		}catch (Exception exception) {    //burası çalışır 
			System.out.println("Loglandı : "+ exception);  //logluyoruz  //diğerlerinde çalışmazsa nerede hata aldığımızı görmek için
		}
		finally {  //burası her zaman çalışır
			System.out.println("Ben her turlu calisirim");
		}
	}

}
