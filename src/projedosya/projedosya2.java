package projedosya;
import java.util.*;
public class projedosya2 {

	public static int sonuc=0;
	public static void main(String[] args)
	{
		int n, toplam;	
		Scanner girdi = new Scanner(System.in);
		System.out.println("Bir sayý giriniz: ");
		n=girdi.nextInt();
		toplam = basamaklarToplami(n);
		System.out.println( n + " sayýsýnýn rakamlarý toplamý: " + toplam);
	}

	public static int basamaklarToplami(int n)
	{	
		sonuc=sonuc+(n%10);
		n=n/10;
		if(n>0)
		{
			return basamaklarToplami(n);
		}
		return sonuc;
	}
}	
