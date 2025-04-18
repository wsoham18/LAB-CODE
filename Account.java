package test;


import java.util.Scanner;

public class Account 
{
	String account; 
	String accountHolder;
	double balance;
	

   Account(String acc, String acc_ho, double bal)
   {
	String account = acc;
	String accountHolder = acc_ho;
	double balance= bal;
   }
   
   public void deposit(double amount)
   {
	  if (amount>0)
		  
	  {
		  balance+=amount;
		  System.out.println("Deposited  "+amount);
	  }
	  else {
		System.out.println("Invalid amount");  
	  }
   }
   
   public void withdraw(double amount)
   {
	  if (amount>0 && amount<=balance)
		  
	  {
		  balance-=amount;
		  System.out.println("Withdraw   "+amount);
	  }
	  else {
		System.out.println("Invalid amount");  
	  }
   }
   
   public void displaybalance() 
   {
        System.out.println("Account  "+account+"|Account Holder  "+"Balance  "+balance);
   }
	public static void main(String[] args) {
		
		Scanner dp=new Scanner(System.in);
		String account1=dp.nextLine();
		String accountHolder1=dp.nextLine();
		double balance1=dp.nextDouble();
		
		Account acc1 = new Account(account1,accountHolder1,balance1);
		acc1.displaybalance();
		acc1.deposit(dp.nextDouble());
		acc1.withdraw(dp.nextDouble());
		acc1.displaybalance();
		}

	}
