import java.util.*;
class Quadratic
{
    public static void main(String args[])
        {
            double r1,r2;
            System.out.println("Program to calculate roots of quadratic eqn of the form ax^2+bx+c=0\nEnter the values of a,b and c:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = (b*b-4*a*c);
            if (d>=0)
            {
                r1=(-b+Math.sqrt(d))/(2*a);
                r2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("The roots are real and are equal to "+r1+" and "+r2);
            }
            else
            {
                System.out.println("The roots are imaginary");
            }
}
}
