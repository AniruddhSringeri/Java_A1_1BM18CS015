package CIE;

import java.util.*;

public class Student
{
	String usn, name;
	int sem;
	Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student's name:   ");
		name = sc.next();
		System.out.print("Enter student's USN:    ");
		usn = sc.next();
		System.out.print("Enter student's semester:  ");
		sem = sc.nextInt();
		
	}
	
	public void display()
	{
		System.out.println("STUDENT DETAILS\nName:  " + name + "\nUSN:  " + usn + "\nSemester:  " + sem);
	}
}



