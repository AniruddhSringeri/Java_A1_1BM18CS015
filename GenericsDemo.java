//Write a program to demonstrate generics with multiple object parameters

import java.util.*;

class Generics<A, B> 
{
	A ob1;
	B ob2;
	void display(A ob1, B ob2)
	{
		this.ob1 = ob1;
		this.ob2 = ob2;		
		System.out.println(ob1 + "    " + ob2);
	}
}

class GenericsDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);		
		Generics<Integer, String> ob = new Generics<Integer, String>();
		System.out.println("Enter an integer:   ");
		int integer = sc.nextInt();
		System.out.println("Enter a string:  ");
		String string = sc.next();
		
		ob.display(integer, string);
	}
}
