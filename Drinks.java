package foodordering;

import java.util.Scanner;

class Drinks {
    Scanner sc = new Scanner(System.in);
    int total,quantity,ch1;//init
    
  //creating the methods
    void Drinks() {
    	
    	int water=19;
		int chocolate_drink=100;
		int Orange_Mocktail=20;
		int Apple_juice=30;
		
		System.out.println("menu for the Desert");
		System.out.println("   1 Water             19/-");
		System.out.println("   2 Chocolate drink   100/-");
		System.out.println("   3 Orange Mocktail   120/-");
		System.out.println("   4 Apple juice       30/-");
		System.out.println("Enter the choice ");
		ch1 = sc.nextInt();
		switch(ch1) {
		 case 1:
			System.out.println("you selected water  ");
			System.out.println("Enter the quqatity");
			quantity = sc.nextInt();
			total=total+quantity*water;
		 break;
		 case 2:
			System.out.println("you selected Chocolate drinks ");
			System.out.println("Enter the quqatity");
			quantity = sc.nextInt();
			total=total+quantity*chocolate_drink;
			System.out.println("the total price is"+total);
		 break;
		 case 3:
			System.out.println("you selected Orange Mocktail drinks");
			System.out.println("Enter the quqatity");
			quantity = sc.nextInt();
			total=total+quantity*Orange_Mocktail;
			System.out.println("the total price is"+total);
		 break;
		 case 4:
			System.out.println("you selected Apple juice ");
			System.out.println("Enter the quqatity");
			quantity = sc.nextInt();
			total=total+quantity*Apple_juice;
			System.out.println("the total price is"+total);
		 break;
		 default:
			System.out.println("Enetr the valid number");
		 break;
		}
		System.out.println("Your bill is "+total);
    }
}
