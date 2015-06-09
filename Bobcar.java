	import java.util.Scanner;


	public class Bobcar {
		public static void main(String[] args){
			System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
			
			Scanner input = new Scanner(System.in);
			int n1,n2,n3,n4 = 0;
		
			
			System.out.print("Please choose the rental car:");
		    n1 = input.nextInt();
		    System.out.print("Please enter the number of rental days:");
		    n2 = input.nextInt();
		    System.out.print("Club member?: 1 for yes, 0 for no:");
		    n3 = input.nextInt();
		    if (n3 == 1){
		    
		    	System.out.print("Platinum Executive Package?: 1 for yes, 0 for no:");
		    n4 = input.nextInt();}
		  
		   int cost = 0;
		   int total = 0;
		  
		   if (n1 == 1){
			   cost = 25;
			   total = (cost*n2);
		   	System.out.println("");
			   System.out.println("Base: " + n2 +" days for a Economy @ $25 per day:      $" +cost*n2);
		   }
		   	else if (n1 == 2){
			   cost = 55;
			   total =(cost*n2); 
				System.out.print("Base: " + n2 + " days for a Compact @ $55 per day:");
			   	System.out.println(cost*n2);
		    }
		   else if (n1 == 3){
			   cost = 100;
			   total =(cost*n2);
				System.out.print("Base: " + n2 + " days for a Standard @ $100 per day:");
			   	System.out.println(cost*n2);
		    }
		   int discount = 0;
		   if (n3 == 1){
			discount = (int)(n2/5)*cost;
			System.out.println("Club Member dicount:			      -$" + discount);
			}
		   int pac = 0;
		   if (n4 == 1) { 
			pac = (int)(total*.20);
			System.out.println("Platinum Executive Package: 		      +$" + pac);
			}
			System.out.println("");
			System.out.println("Total Estimate for Rental:                     $" + (total-discount+pac) );
		}
	}

	

			
		
			
			
		   
				   
		
			
			
		
			
			
			

			
					

			
		