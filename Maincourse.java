package foodordering;

import java.util.Scanner;


	
	
	class Maincourse{
		Scanner sc = new Scanner(System.in);
		int total,quantity,ch1;//init
		
		//creating the methods
		void Maincourse() {
			int Friedrice=190;
			int hakka_noodles=180;
			int Burger=149;
			int Pastry=100;
			System.out.println("menu for the Main Course");
			System.out.println("   1 Friedrice       190/-");
			System.out.println("   2 hakka noodles       180/-");
			System.out.println("   3 Burger       149/-");
			System.out.println("   4 Pastry       100/-");
			System.out.println("Enter the choice ");
			ch1 = sc.nextInt();
			switch(ch1) {
			case 1:
				System.out.println("you selected Friedrice ");
				System.out.println("Enter the quqatity");
				quantity = sc.nextInt();
				total=total+quantity*Friedrice;
				System.out.println("the total price is"+total);
			break;
			case 2:
				System.out.println("you selected hakka_noodles ");
				System.out.println("Enter the quqatity");
				quantity = sc.nextInt();
				total=total+quantity*hakka_noodles;
				System.out.println("the total price is"+total);
			break;
			case 3:
				System.out.println("you selected Burger ");
				System.out.println("Enter the quqatity");
				quantity = sc.nextInt();
				total=total+quantity*Burger;
				System.out.println("the total price is"+total);
			break;
			case 4:
				System.out.println("you selected Pastry ");
				System.out.println("Enter the quqatity");
				quantity = sc.nextInt();
				total=total+quantity*Pastry;
				System.out.println("the total price is"+total);
			break;
			default:
				System.out.println("Enetr the valid number");
			break;
		}
			System.out.println("Your bill is "+total);
	}
	}
	
	