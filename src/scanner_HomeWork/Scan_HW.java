package scanner_HomeWork;

import java.util.Scanner;

public class Scan_HW {
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		float Stax = 0.03f;
		
		
		System.out.println("Pencil Qty");
		int pencilQ = sc.nextInt();
		System.out.println("Pencil Price");
		double pencilP = sc.nextDouble();
		double totalpencilesP = pencilQ * pencilP;
		
		System.out.println("box Qty");
		int boxQ = sc.nextInt();
		System.out.println("box Price");
		double boxP = sc.nextDouble();
		double totalboxesP = boxQ * boxP;
		

		System.out.println("Tortilla Qty");
	    int tortillaQ =sc.nextInt();
        System.out.println("Tortilla Price");
		double tortillaP = sc.nextDouble();
		double totatortillaP = tortillaQ * tortillaP;
		
		System.out.println("Mango Qty");
	    int mangoQ =sc.nextInt();
        System.out.println("Mango Price");
		double mangoP = sc.nextDouble();
		double totalmangoP = mangoQ * mangoP;
		
		
		double subtotal = (totalpencilesP + totalboxesP + totatortillaP + totalmangoP);
		
		double TotalTax =(subtotal*Stax);
		
		double TOTALaf = (subtotal+ TotalTax);
		

		System.out.println("                 Walmart                         ");
		System.out.println("              5405 SOUTH RICE AVE                 ");
		System.out.println("               Houston, TX, 77081                 ");
		System.out.println("                 123-412-1235                      ");
		System.out.println("*************************************************");
		System.out.println("  *  Item      Qty              Price");
		System.out.println("                                                  ");
		
		System.out.println("  *  Pencil "+"\t"  + pencilQ +   "\t\t" +  "$"+totalpencilesP);
		
		System.out.println("  *  Box "+"\t"  + boxQ +   "\t\t" +  "$"+totalboxesP);
		
		System.out.println("  *  tortilla "+"\t"  + tortillaQ +   "\t\t" +  "$"+totatortillaP);
		
		System.out.println("  *  mango "+"\t"  + mangoQ +   "\t\t" +  "$"+totalmangoP);
			
			
	  System.out.println("---------------------------------------------------------------");
			
	  
	  System.out.printf("                           stotal =$ %.2f", +   subtotal       );	

      System.out.println();
  	System.out.printf("                              Sales Tax = $ %.2f" ,TotalTax);
  	System.out.println();
  	System.out.printf("                                  TOTAL = $ %.2f" , TOTALaf);
		System.out.println();
	System.out.println("..................Thank YOU..............................");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
