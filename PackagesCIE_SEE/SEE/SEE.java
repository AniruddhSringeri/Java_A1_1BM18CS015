package SEE;
import java.util.*;

public class Externals extends CIE.Student
{
	int see[] = new int[5];
	Externals()
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
}
