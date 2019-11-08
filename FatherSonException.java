//Write a program that demonstrates handling of exceptions in inheritance tree. Create a base class called “Father” and derived class called “Son” which extends the base class. In Father class, implement a constructor which takes the age and throws the exception WrongAge( ) when the input age=father’s age.

import java.util.*;
class Father
{
	int father_age;
	Father(int a) throws AgeException
	{
		if (a < 0)
		{
			throw new AgeException();
		}
		father_age = a;
	}
}

class Son extends Father
{
	int son_age;
	Son(int a, int b) throws AgeException
	{
		super(a);		
		if (a < b)
			throw new AgeException();
		else 
		{
			son_age = b;
		}
	}
}

class AgeException extends Exception
{
	public String toString()
	{
		return "Invalid age";
	}
}

class FatherSonException
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter father's age:  ");
		int father_age = sc.nextInt();
		System.out.println("Enter son's age:     ");
		int son_age = sc.nextInt();
		
		try
		{
			Son son = new Son(father_age, son_age);
			System.out.println("The father is " + (son.father_age - son.son_age) + " years older than the son.");
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
	}
}
		
