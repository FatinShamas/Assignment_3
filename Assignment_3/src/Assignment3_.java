import java.util.Arrays;
import java.util.Scanner;
public class Assignment3_ {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String name,TV;
		int age,price,item,cust;
		char gender;
		double discount, total;
		
		System.out.println("***********Welcome To Our TV's Shop**********************");
		System.out.println();
		
		System.out.println("***********Now, Our Shop Have A Blast Promosi!***********");
		System.out.println();
		
	    //calling method
	
		//Array 2D
		String [][] myname = {{"Mrs", "Mr", "Miss"},
				              {"Fatin", "Akmal", "Rajh"}
		};
		System.out.println();
		System.out.println("Hai my dear customer, with me, your personal assistant in this shop today, " +myname[0][2]+ " " +myname [1][0]+ ".");
		
		System.out.println();

		//FOR LOOP
		for(int i=0; i < 2;i++) {
		System.out.print("Enter name of the customer that come into the shop: ");
		name = in.next();
	    }
		
		
		//DO-WHILE LOOP
		int x =1;
		
		do {
		System.out.print("Enter the age of the customer:"+x+ ".");
		age = in.nextInt();
		x++;
		}
		while(x<3);
		
		System.out.print("Enter gender of the customer:" );
		gender = in.next().charAt(0);
		
		System.out.println();
		
		
		//REPETITION STRUCTURE (IF/ELSE) FOR GENDER
		if(gender=='F') {
			System.out.println("You can claim item under RM50, at the Watson and Guardian shop. After you buy with our product. Don't miss it!");
		}
		else
			if(gender=='M') {
				System.out.println("You can claim item under RM50, at the electric shop. After you buy with our product. Don't miss it!");
				
			}
			else
				System.out.println("None");
		
		
		System.out.println();
		
		//Array
		System.out.println("Take a look at our product. There's plenty of new good quality TV!");
		
		String[][]  product_1 = {
				                {"QLED", "OLED"},
		                        {"DLP", "Plasma"},
		                        {"LCD","Direct_TV"}
		};
		
		  for (int i = 0; i < product_1.length; i++)
		  {
		         System.out.print( product_1[ i ] [ 0 ] + " , " );
		         for (int j = 1; j <  product_1[ i ].length; j++)
		         {
		                    System.out.print( product_1[ i ][ j ] + " ");
		         }
			System.out.print("\n");
		}

		  System.out.println();

		
		System.out.print("Enter the product/services: ");
		String product = in.next();
		
		if(product.equals("QLED")) {
			System.out.println("The price is RM987");
		}         
		if(product.equals("OLED")) {
			System.out.println("The price is RM1,600");
		}
			else
				if(product.equals("LCD")) {
					System.out.println("The price is RM2,260");
				}
				else
					if(product.equals("DLP")) {
						System.out.println("The price is RM1,940");
					}
					else
						if(product.equals("Plasma")) {
							System.out.println("The price is RM850");
						}
						else
							if(product.equals("Direct_TV")) {
								System.out.println("The price is RM1,200");
							}
							else
								System.out.println("None");
	
							
							
		System.out.println();
		
		//passing method
		
	    //how many item that customer purchase
		final int SIZE = 4; //size array
		
		int[] num_array = new int[SIZE];
		
		//passing array
		fillArray(num_array, SIZE);
		System.out.println("Limit number items when shopping are: ");
		
		printArray(num_array, SIZE);
		
		System.out.println();

		
		System.out.print("Enter how many item purchase: ");
		item = in.nextInt();
		
		
		
		System.out.println();
		
		//calculate the total price
		System.out.print("Enter the price given is RM ");
		price = in.nextInt();
		
		System.out.println();
		
		total = price * item;
		System.out.println("The total price: RM" +total);
		
		
		//discount
		System.out.println();
		if(total>1000) {
			discount = total * 0.1;
		}
		else
			discount = total * 0.2;
		
		System.out.println("Discount received: RM" +discount);
		System.out.println("Price to be paid on the product after discout: RM" +(total-discount));
		
		System.out.println();
		
		
		//WHILE LOOP
		System.out.println("Before you go back, let's pick one that you like and go redeem your coupon! Interesting isn't it!?");
		
		//Single Array
		String[] array1 = new String[] {"KFC", "Mcdonald", "Subway"};
		
		//iterating all elements in the array
		for(int i=0; i< array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		
		
		System.out.println();
		System.out.println("***************THANK YOU MY BELOVED CUSTOMER, HOPE TO SEE YOU AGAIN!***************");
		
		}
	
	public static void fillArray(int[] num_array, int n) {
		Scanner in = new Scanner (System.in);
		
	System.out.println("Enter " + n + " integer:");
		
		for(int i=0; i<n; i++) {
			
			num_array[i] = in.nextInt();
	}
	}
		
	public static void printArray(int[] num_array, int n) {
		Scanner in = new Scanner (System.in);
		
		for(int i=0; i<n; i++) {
			
			System.out.print(num_array[i] + " ");
		
	}
	}
}



		
		



		
