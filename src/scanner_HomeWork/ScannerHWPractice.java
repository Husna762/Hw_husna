package scanner_HomeWork;

public class ScannerHWPractice {
	
	


	import java.util.Scanner;

	public class Scan_Homework {
		
		public static void main(String args[] ) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your store name");
			String storeName = scan.nextLine();
			System.out.println("Store Name : "+storeName);
			
			System.out.println("Tortillas Qty");
			int tortillaq = scan.nextInt();
			System.out.println("tortillas Qty : "+tortillaq );
			
			System.out.println("Tortilla Price");
			double tortillaPrice = scan.nextDouble();
			double totaltortillasPrice =tortillaPrice*tortillaq;
			System.out.println("tortillas price : "+totaltortillasPrice );
			
			
			System.out.println("Mango Qty");
			int mangoq = scan.nextInt();
			System.out.println("Mango Qty : "+mangoq );
			
			System.out.println("Mango Price");
			double mangoPrice = scan.nextDouble();
			double totalMangoPrice =mangoPrice*mangoq;
			System.out.println("Mango price : "+totalMangoPrice);
			
			System.out.println("Milk Qty");
			int milkq = scan.nextInt();
			System.out.println("Milk Qty : "+milkq );
			
			System.out.println("Milk Price");
			double milkPrice = scan.nextDouble();
			double totalMilkPrice =milkPrice*milkq;
			System.out.println("Milk price : "+totalMilkPrice);
			
			
			System.out.println("chicken Qty");
			int chickenq = scan.nextInt();
			System.out.println("Chicken Qty : "+chickenq );
			
			System.out.println("Chicken Price");
			double chickenPrice = scan.nextDouble();
			double totalchickenPrice =chickenPrice*chickenq;
			System.out.println("Chicken price : "+totalchickenPrice);
			
			double subtotal= (totaltortillasPrice+totalMangoPrice+totalMilkPrice+totalchickenPrice);
			System.out.println("SUBTOTAL:"+subtotal);
			
			
			System.out.println("Enter Tax bracket");
			double stax = scan.nextDouble();
			System.out.println("Tax bracket : "+stax);
			
			double totalTax = (subtotal*(stax));
			System.out.println("Tax : "+totalTax);
			
			double total = (subtotal+totalTax);
			System.out.println("TOTAL PRICE : "+total);
			
			
			
			System.out.println("^^^^^^^^^^^^^^INVOICE^^^^^^^^^^^^^^^^^");
			System.out.println("                                       ");
			System.out.println("------------------Walmart-------------");
			System.out.println("============5405 SOUTH RICE AVE=======");
			System.out.println("-------------Houston TX,77081---------");
			
	        System.out.println("***************************************");
			System.out.println("    Product             Total");
			System.out.println(" --------------      -----------");
			System.out.println("    Tortillas            6.00");
			System.out.println("     Mango               10.00");
			System.out.println("      Milk                7.00");
			System.out.println("     Chicken              14.00");
			System.out.println(" -----------------------------------------");
			System.out.println("                 SUBTOTAL = 37.00  ");
			System.out.println("                  Tax 30% = 11.1 ");
			System.out.println("              TOTAL PRICE =  48.1");
			System.out.println("############################################");
			
			System.out.println("~~~~~~Thank you for shopping at Walmart~~~~~");
			
			

		

			
			
			
			
			
		    
			

		
			
					
			
			
			
			
			
			
			
			
		}

	}


}
