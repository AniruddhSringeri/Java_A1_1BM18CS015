/*Develop a Java program to create a class Student whose variables are usn, name and sem.
Derive a class Test from Student to include an array of cie marks of each course and their
corresponding credits in another array. Derive a class Exam from Test which includes an
array of see marks. Derive a class Result which calculates the grade for each course and
the SGPA. Create n student objects and displays all the above details.*/

import java.util.*;
import java.lang.System.*;
final Scanner sc = new Scanner(System.in);
class Student
{
	String usn, name;
	int sem;
	Student()
	{
		getdata();
	}
	void getdata()
	{
		System.out.println("Enter name:  "); name = sc.next();
		System.out.println("Enter usn:  "); usn = sc.next();
		System.out.println("Enter sem:  "); sem = sc.nextInt();
	}
}

class Test extends Student
{
	int cie[] = new int[6];
	int credits[] = new int[6];
	Test()
	{
		super();
		getdata();
	}
	void getdata()
	{
		System.out.println("Enter the marks in cie out of 50 and credits of each of the six subjects:  \n");
		for(int i = 0; i < 6; i++)
		{
			System.out.println("Subject "+(i+1));
			cie[i] = sc.nextInt();
			credits[i] = sc.nextInt();
		}
	}
}

class Exam extends Test
{
	int see[] = new int[6];
	Exam()
	{
		super();
		getdata();
	}
	void getdata()
	{
		System.out.println("Enter the marks in see out of 50 of each of the six subjects:  \n");
		for(int i = 0; i < 6; i++)
		{
			System.out.println("Subject "+(i+1));
			see[i] = sc.nextInt();
		}
	}
}

class Result extends Exam
{
	int marks[] = new int[6];
	int flag = 0;
	int grade[] = new int[6];
	Result()
	{
		super();
		for(int i = 0; i < 6; i++)
		{
			marks[i] = cie[i] + see[i];
			if(marks[i] >=90) grade[i] = 10;
			else if((marks[i] <90)&&(marks[i] >= 75)) grade[i] = 9;
			else if((marks[i] <75)&&(marks[i] >= 60)) grade[i] = 8;
			else if((marks[i] <60)&&(marks[i] >= 50)) grade[i] = 7;
			else if((marks[i] <50)&&(marks[i] >= 40)) grade[i] = 6;
			else { grade[i] = 0; flag = 1; }
		}
		calculateResult();
	}
	void calculateResult()
	{	
		if(flag == 1) System.out.println("Failed");
		
		
	
		

































		
		
		
	
