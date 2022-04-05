package enBuyukVeEnKucukSayiyiBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Kaç adet sayi gireceksiniz: ");
		int arrayLength=scanner.nextInt(),minValue=0,maxValue=0;
		if(arrayLength==1) {
			System.out.println("Bir sayý ile karþýlaþtýrma yapýlamaz");
		}
		int[] sayilar=new int[arrayLength];
		
		
		for(int i=0;i<=sayilar.length-1;i++) {
			System.out.print(i+1+". sayýyý giriniz:");
			sayilar[i]=scanner.nextInt();
			if(i==0) {
				minValue=sayilar[i];
				maxValue=sayilar[i];
			}
			if(sayilar[i]<minValue) {
				minValue=sayilar[i];
				
			}
			if(sayilar[i]>maxValue) {
				maxValue=sayilar[i];
			}           				
		}	
		
			System.out.println("En büyük sayý: "+maxValue+" en küçük sayý: "+minValue);
		
		
		
	}

}
