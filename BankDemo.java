/*Develop a Java program to create a class Account that maintains two kinds of account for its customers, one called savings account and the other current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge is imposed.
Create a class Account that stores customer name, account number and type of account. From this derive the classes Curr-acct and Sav-acct to make them more specific to their requirements. Include the necessary methods in order to achieve the following tasks:
Accept deposit from customer and update the balance.
Display the balance.
Compute and deposit interest
Permit withdrawal and update the balance
Check for the minimum balance, impose penalty if necessary and update the balance.*/

import java.util.*;
import java.lang.System.*;
class Account
{
	float balance;
	String name, acc_no;
	Account()
	{
		balance = 0;
		getdata();
	}
	void display()
	{
		System.out.println("Balance: "+balance);
	}
	void deposit()
	{
		System.out.println("Enter amount to be deposited:  ");
		Scanner sc = new Scanner(System.in);
		balance += sc.nextFloat();
	}
	void withdrawal()
	{
		System.out.println("Enter withdrawal amount:  ");
		Scanner sc = new Scanner(System.in);
		balance -= sc.nextFloat();
		System.out.println("Amount withdrawn.");
	}
	void getdata()
	{
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter balance:  "); balance = sc.nextFloat();
		System.out.println("Enter name:  "); name = sc.next();
		System.out.println("Enter account number:  "); acc_no = sc.next();
	}
        void addInterest(){}
	void penalty() {}
}

class Savings extends Account
{	
	float interest;
	Savings()
	{
		super();
	}
	void addInterest()
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time(in years):  ");
		float t = sc.nextFloat();
		float ci = (float)(balance*Math.pow(1.08,t));
		balance += ci;
	}
}
class Current extends Account
{
	final float min_balance = 500;
	Current()
	{
		super();
	}
	void penalty()
	{
		if(balance < min_balance)
		{	
			balance -= 200;
			System.out.println("You have been penalized for crossing the minimum balance.");
		}
	}
}

class BankDemo
{
	public static void main(String args[])
	{
		int ch, ch1;
		Account A = null;
		System.out.println("Enter choice: 1 for savings, 2 for current:  ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		if(ch == 1)
		{
			A = new Savings();
		}
		else if(ch == 2)
		{
			A = new Current();
		}
		else { System.out.println("Wrong input"); System.exit(0); }
		do
		{
			System.out.println("Enter 1: deposit, 2: withdrawal, 3: display, 4: interest, anything else to exit:   ");
			ch1 = sc.nextInt();
			switch(ch1)
			{
				case 1: A.deposit(); break;
				case 2: A.withdrawal(); if(ch == 2) A.penalty(); break;
				case 3: A.display(); break;
				case 4: if(ch == 1) A.addInterest(); break;				
				default: System.exit(0);
			}
		} while(true);
	}
}
				

























		
		
	
