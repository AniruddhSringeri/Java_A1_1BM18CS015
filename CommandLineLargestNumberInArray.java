import java.util.*;
class CommandLineLargestNumberInArray{
    public static void main(String args[])
    {
        int largest = 0;
	for(int i=0; i<args.length; i++)
        {
            System.out.println(Integer.parseInt(args[i]));
        }
        
	for(int i = 0; i<args.length; i++)
	{
	    if(Integer.parseInt(args[i])>largest) largest = Integer.parseInt(args[i]);
	}
	
	System.out.println("The largest of the numbers is "+largest);
        
    }
}
