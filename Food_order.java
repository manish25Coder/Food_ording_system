package foodordering;
//
//import java.util.Scanner;
//
//
//public class Food_order {
//	int ch;
//	Scanner sc = new Scanner(System.in);
//	public static void main(String[] args) {
//		Food_order obj = new Food_order();
//		obj.Menu();
//	}
//		
//		public void Menu() {
//		 System.out.print("*********Welcome to our food ording system***********");
//	       System.out.println("\nMENU");
//	       System.out.println("1 Starters");
//	       System.out.println("2 Main coures");
//	       System.out.println("3 Deserts");
//	       System.out.println("4 Drinks");
//		
//	      
//		do {
//			System.out.println("Enter the choice");
//			ch = sc.nextInt();
//			switch(ch) {
//			case 1:
//				
//
//			break;
//			
//				
//				
//			}
//	}while(ch=='Y' || ch=='y');
//		System.out.println("");
//
//}}
//

//package pyramid;

import java.util.Scanner;

public class Food_order {
	int ch,quantity;     //init value
	String total;
	char ch2,ans;
	double starters,maincourse,bill;

    Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Food_order obj = new Food_order();  //creating object
		obj.display();  //calling function
	}
		

		
		public void display() {
			
			
			//calling the function
			Starters obj1=new Starters();
			Maincourse obj2=new Maincourse();
			Desert obj3=new Desert();
			Drinks obj4=new Drinks();
			
			
			
			//for repeating and checking weather y/n 
	       do {
	    	   
	    	   System.out.print("*********Welcome to our food ording system***********");
		       System.out.println("\nMENU");
		       System.out.println("1 Starters");
		       System.out.println("2 Main cours");
		       System.out.println("3 Deserts");
		       System.out.println("4 Drinks");
			System.out.println("Enter the choice");
			ch = sc.nextInt();
			 
			switch(ch) {
			case 1:
				
				obj1.Starters();
				
			break;
			case 2:
				obj2.Maincourse();
			break;
			case 3:
				obj3.Desert();
			break;
			case 4:
				obj4.Drinks();
			default:
				System.out.println("Enetr the valid number");
			break;
				
			
			
			}
			System.out.println("Do you want to add more y/N ");//yes or no to go in do while loop
			ch2=sc.next().charAt(0);
	}while(ch2=='Y' || ch2=='y');
	     
	       
		System.out.println("------Thankyou for ording the food---------");//print at the end 
	}
		
}
	

