package q2Inharetance;

import java.util.Scanner;

public class CreditCardApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name");
		String name=sc.next();
		System.out.println("Enter Credit Points");
		int points=sc.nextInt();
		
		Customer c=new Customer(name,points);
		
		System.out.println(CardsOnOffer.getOfferedCard(c));
				
	}

}
