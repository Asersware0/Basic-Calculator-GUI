import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		//değişken tanımlama ve kullanıcı girişi
		int sayi1,sayi2,secim;
		
		String devam;
		
		
		do {
			
		
			System.out.print("Lütfen birinci sayıyı giriniz: ");
			sayi1 = giris.nextInt();
			System.out.print("\nLütfen ikinci sayıyı giriniz: ");
			sayi2 = giris.nextInt();
		
		
		//işlemleri seçtirme
			System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz!!");
			System.out.println(" 1- Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme \n 5- Mod Alma");
			System.out.println("Seçiminiz: ");
			secim = giris.nextInt();
		
			if(secim == 1) {
				System.out.println("Toplama Sonucu: " + (sayi1 + sayi2));
			}
		
			else if(secim == 2)
			{			
				System.out.println("Çıkarma Sonucu: " + (sayi1 - sayi2));	
			}
		
			else if (secim == 3)
			{
				System.out.println("Çarpma Sonucu : "+ (sayi1 * sayi2));
			
			}
		
			else if(secim == 4) 
			
			{
				if (sayi2 == 0){
					System.out.println("ikinci sayı sıfara eşittir ve sonuç tanımsızdır.");
				}
				else {		
					System.out.println("Bölme Soncu: " + (sayi1 / sayi2));
				}
			}
		
			else if (secim == 5){
				System.out.println(" Mod Alma Sonucu. " + (sayi1 % sayi2));
			}
		
			else {
				System.out.println("Geçersiz bir işlem girdiniz Lütfen 1-4 arasında bir sayı giriniz...");
			}
			 System.out.print("Başka bir işlem yapmak istiyor musunuz? (E/H): ");
	         devam = giris.next();
		
		}while (devam.equalsIgnoreCase("E")); 
		
		System.out.println("Hesap makinesi kapatılıyor...");
        giris.close();
		
	}
}
