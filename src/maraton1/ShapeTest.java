package maraton1;

import java.util.Scanner;

public class ShapeTest {
	int side1;
    int side2;
    int side3;
	int side4;
	int area;
	int perimeter;
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	public void readInput(){
		int i = 1;
	do {
		
		System.out.println("Lütfen hesaplamak istediğiniz şeklin (en fazla dört kenar) kenar uzunluklarını giriniz(-1 ile çıkış)");
		System.out.println("Lütfen 1. kenar uzunluğunu giriniz(0 ile sonlandır):");
		side1 = scanner.nextInt();	
		if(side1 == -1) {
			break;	
		}	
		System.out.println("Lütfen 2. kenar uzunluğunu giriniz(0 ile sonlandır):");
		side2 = scanner.nextInt();	
		if(side2 == -1) {
			break;	
		}	
		
		System.out.println("Lütfen 3. kenar uzunluğunu giriniz(0 ile sonlandır):");
		side3 = scanner.nextInt();	
		if(side3 == -1) {
			break;	
		}	
		
		System.out.println("Lütfen 4. kenar uzunluğunu giriniz(0 ile sonlandır):");
		side4 = scanner.nextInt();	
		if(side4 == -1) {
			break;	
		}	

		int perimeter = side1+side2+side3+side4;
		int area = side1 * side2 ; // alan kısmını sadece iki kenar çarpımı olarak gösterdim hepsi için. 
		
		System.out.println(i+".Şeklin Çevresi:" +  perimeter);
		System.out.println(i+".Şeklin Alanı:" +  area);
		
		
		
		if(side1 == 0 && side2 == 0 ) {
			
			System.err.println("İki kenarlı şekil olmaz!");
			
		}else if(side3 == 0 && side4 == 0){
			
			System.err.println("İki kenarlı şekil olmaz!");
		}
			
		i++;
    
	}while(true);
        
	}
	

}
