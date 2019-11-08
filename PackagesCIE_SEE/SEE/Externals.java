package SEE;
import java.util.*;


public class Externals extends CIE.Internals
{
	int see[] = new int[5];
	int total[] = new int[5];
	
	public Externals()
	{
		super();
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of the student in SEE:   ");
		for( int i = 0; i < 5; i++)
		{
			System.out.print("Subject "+(i+1)+":  ");
			see[i] = sc.nextInt();
		}
	}

	public void display()
	{
		super.display();
		System.out.println("Marks in SEE:");
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Subject "+(i+1)+":  "+see[i]);
		}
	}
	
	public void displaytotal()
	{
		System.out.println("Total marks:");
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Subject "+(i+1)+":  "+see[i]);
		}
	}

	public void total()
	{
		for(int i = 0; i < 5; i++)
		{
			see[i] = see[i] + cie[i];
		}
	}
		
}
