import java.util.Scanner;

public class MakeChange {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price, tendered, changeAmt;
		
		System.out.print("Price of the item: $");
		price = sc.nextDouble();
		System.out.print("\nAmount of money given to pay for the item: $");
		tendered = sc.nextDouble();
		
		changeAmt = tendered - price;
		
		// check to see if cashier received enough $$
		if (changeAmt < 0) {
			// enter a do while loop to prompt customer for more $$
			do {
				System.out.println("Uhhh...you owe me more money...");
				tendered = sc.nextDouble();
				changeAmt = tendered - price;
			}while (changeAmt <= 0);
		}
		
		// check to see if cashier received exact change
		if (changeAmt == 0) {
			
			System.out.println("Thank you, have a nice day!");
		}
		
		// check to see if cashier owes change back to customer
		if (changeAmt > 0) {
			// display how much change is due to the customer
			System.out.println("Change due is: $" + (changeAmt));
			//System.out.println("Change due is: $" + Math.round(changeAmt));
			// call the make change method
			makeBillsChange(changeAmt);
			makeChange((int)(Math.round((changeAmt - (int)changeAmt) * 100)));
			System.out.println("Have a great day!");
			
		}
	}
		
	public static void makeBillsChange(double billsDue) {
		int tens, fives, ones;
			
			tens = (int)billsDue/10;
				//System.out.println("tens due: " + tens );
			billsDue = billsDue % 10;
				//System.out.println("new change due: " + billsDue);
			
			fives = (int)billsDue/5;
				//System.out.println("fives due: " + fives );
			billsDue = billsDue % 5;
				//System.out.println("new change due: " + billsDue);
			
			ones = (int)billsDue;
			System.out.println("Tens: " + tens + "\nFives: " + fives + "\nOnes: " + ones);
	}
	
	public static void makeChange(int changeDue) {
			//System.out.println("coins due " + changeDue);
		int quarters, dimes, nickels, pennies;
		
			quarters = (int)changeDue/25;
				//System.out.println("quarters due: " + quarters );
			changeDue = changeDue % 25;
			
			dimes = (int)changeDue/10;
				//System.out.println("tens due: " + dimes );
			changeDue = changeDue % 10;
				//System.out.println("new change due: " + changeDue);
			
			nickels = (int)changeDue/5;
				//System.out.println("fives due: " + nickels );
			changeDue = changeDue % 5;
				//System.out.println("new change due: " + changeDue);
			
			pennies = (int)changeDue;
			System.out.println("Quarters: " + quarters + "\nDimes: " + dimes + "\nNickels: " + nickels + "\nPennies: " + pennies);
	}
}

