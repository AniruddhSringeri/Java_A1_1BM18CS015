package CIE;

import java.util.*;

public class Internals extends Student
{
	public int cie[] = new int[5];
	public Internals()
	{	
		super();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of the student in CIE:   ");
		for( int i = 0; i < 5; i++)
		{
			System.out.print("Subject "+(i+1)+":  ");
			cie[i] = sc.nextInt();
		}
	}

	public void display()
	{
		super.display();
		System.out.println("Marks in CIE:");
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Subject "+(i+1)+":  "+cie[i]);
		}
	}
}
