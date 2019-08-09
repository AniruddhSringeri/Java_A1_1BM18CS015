import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
    //program to print first n fibonacci numbers where n is taken as input from user
    System.out.println("Enter the number of Fibonacci numbers you want: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fibonacci(n);
    
   } 

static void fibonacci(int n)
{

    int counter=0,i=1,j=0,prev;
    System.out.println("\n\n\n");

    while(counter<n) 
    {
        System.out.println(i);
        prev=i;
        i=i+j;
        j=prev;
        counter++;
    }
}


    
}
            
        
