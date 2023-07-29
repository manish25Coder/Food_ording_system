package foodordering;

import java.util.Scanner;


 class Starters {
	 Scanner sc = new Scanner(System.in);
		int total,quantity,ch1;//init
		
		//creating the methods
		void Starters() {
	 

	int Samosa=15;
	int Fried_Chicken=180;
	int Sev_Puri=50;
	int French_Fries=60;
	
	System.out.println("menu for the Starters");
	System.out.println("   1 Samosa       15/-");
	System.out.println("   2 Fried chicken       180/-");
	System.out.println("   3 Sev Puri       50/-");
	System.out.println("   4 French Fries       60/-");
	System.out.println("Enter the choice ");
	ch1 = sc.nextInt();
	switch(ch1) {
	 case 1:
		System.out.println("you selected Samosa ");
		System.out.println("Enter the quqatity");
		quantity = sc.nextInt();
		total=total+quantity*Samosa;
		
	 break;
	 case 2:
		System.out.println("you selected Fried chicken ");
		System.out.println("Enter the quqatity");
		quantity = sc.nextInt();
		total=total+quantity*Fried_Chicken;
		System.out.println("the total price is"+total);
		
	 break;
	 case 3:
		System.out.println("you selected Sev Puri ");
		System.out.println("Enter the quqatity");
		quantity = sc.nextInt();
		total=total+quantity*Sev_Puri;
		System.out.println("the total price is"+total);
		
	 break;
	 case 4:
		System.out.println("you selected French fries ");
		System.out.println("Enter the quqatity");
		quantity = sc.nextInt();
		total=total+quantity*French_Fries;
		System.out.println("the total price is"+total);
		
	 break;
	 default:
		System.out.println("Enetr the valid number");
	break;
	}
	System.out.println("Your bill is "+total);

		}
		
		
		}
