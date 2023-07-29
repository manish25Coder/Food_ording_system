package foodordering;

import java.util.Scanner;

class Desert {
	 Scanner sc=new Scanner(System.in);
	 int total,quantity,ch1;//init
	//creating the methods
	 void Desert() {
		    int gulab_jamun=25;
			int jalebi=15;
			int laddu=20;
			int Rasgulla=30;
			
			System.out.println("menu for the Desert");
			System.out.println("   1 Gulab jamun       15/-");
			System.out.println("   2 Jalebi            15/-");
			System.out.println("   3 Laddu             20/-");
			System.out.println("   4 Rasgulla          30/-");
			System.out.println("Enter the choice ");
			ch1 = sc.nextInt();
			
			switch(ch1) {
			 case 1:
				System.out.println("you selected Gulab Jamun ");
				System.out.println("Enter the quqatity");
				quantity = sc.nextInt();
				total=total+quantity*gulab_jamun;
			 break;
			 case 2:
				System.out.println("you selected Jalebi ");
				System.out.println("Enter the quqatity");
				quantity = sc.nextInt();
				total=total+quantity*jalebi;
				System.out.println("the total price is"+total);
			 break;
			 case 3:
				System.out.println("you selected Laddu ");
				System.out.println("Enter the quqatity");
				quantity = sc.nextInt();
				total=total+quantity*laddu;
				System.out.println("the total price is"+total);
			 break;
			 case 4:
				System.out.println("you selected Rasgulla ");
				System.out.println("Enter the quqatity");
				quantity = sc.nextInt();
				total=total+quantity*Rasgulla;
				System.out.println("the total price is"+total);
			 break;
			 default:
				System.out.println("Enetr the valid number");
			 break;
			}
			System.out.println("Your bill is "+total);
	 }

}
