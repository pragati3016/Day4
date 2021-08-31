package day4;

import java.util.Scanner;

public class Bank
	{
	private String name;
	private String address;
	private String acc_type;
	private float balance;

	Scanner sc = new Scanner(System.in);
	Bank(){

	name=" ";
	address=" ";
	acc_type=" ";
	balance=0;
	}

	void open_account()
	{
		int n;
		
		String S = "Savings Account";
		String C = "Current Account";
		
		System.out.println("Enter your full name: ");
		name = sc.nextLine();
		System.out.println("Enter your address: ");	
		address = sc.nextLine();
		System.out.println("What type of account you want");
		System.out.println("to open saving(1) or Current(2): ");
		n = sc.nextInt();
		
		if(n == 1)
			acc_type = S;
		else
			acc_type = C;
		
		System.out.println("Enter How much money you want to deposit: ");
		balance = sc.nextInt();
		System.out.println("Account Created Successfully");
	}

	void deposit_money()
	{
		int Amount;
		Amount = 0;
		System.out.println( "Enter how much money you want to deposit: ");
		Amount = sc.nextInt();
		balance += Amount;
		System.out.println( "\nAvailable Balance: "+ balance);
	}

	void display_account()
	{
		
		System.out.println( "Name: " +name);
		System.out.println("Address: "+ address);
		System.out.println("Type: "+acc_type);
		System.out.println("Balance: " +balance);
	}

	void withdraw_money()
	{
		float amount;
		System.out.println("Enter how much money you want to withdraw: ");
		amount = sc.nextInt();
		balance -= amount;
		System.out.println("\nAvailable balance: "+balance);	
	}
	
	void acc_bal()
	{
		  System.out.println("Your Account Balance Is : "+balance);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
	    Bank customer=new Bank();
		
		Scanner sc = new Scanner(System.in);
		
		while(num != 6)
		{
			System.out.println("*****MENU*****");
			System.out.println("1. Open New Account\n2. Display Account Details\n3. Deposit Money\n4. Withdraw Money\n5. Check Account Balance\n6. Exit");
			System.out.println("Enter the Number of which the operation you want to perform :");
			num = sc.nextInt();
		
			switch(num) {
			  case 1:
			  {
				  	customer.open_account();
			  }
			    break;
			  case 2:
			  {
				  customer.display_account();;
			  }
			    break;
			  case 3:
			  {
				  customer.deposit_money();;
			  }
			  	break;
			  case 4:
			  {
				  customer.withdraw_money();;
			  }
			  	break;
			  case 5:
			  {
				  customer.acc_bal();
			  }
			  	break;
			  default:
			  {
				  System.out.println("Thank You! Come Again!!");
			  }
			}		  
		}
	}

}
