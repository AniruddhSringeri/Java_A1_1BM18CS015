import java.util.*;
class Time
{
int h,m,s;
Scanner sc = new Scanner(System.in);
Time()
{
  do{System.out.println("Enter the time hh:mm:ss:  "); h = sc.nextInt(); m = sc.nextInt(); s = sc.nextInt(); } while((h>=24)||(m>=60)||(s>=60));
}

Time (int a, int b, int c){ h = a; m = b; s = c; }
void CurrentTime(int a, int b, int c) { h = a; m = b; s = c; }
void Advance (int a, int b, int c)
{
s = s+c; m = m+b+(s/60); s = s%60; h = h + a + (m/60); m = m%60; h = h%24;
}
void print() { System.out.println("The time is "+h+":"+m+":"+s);}
}


class Main
{
public static void main(String args[])
{ 
    Scanner sc = new Scanner(System.in);
    int ch;
    Time t = new Time(0,0,0);
    do
    {
        System.out.println("Enter 1 for parameter-less input, 2 for parametered input, 3 for Current time, 4 for Advance, 5 to display, and 6 to stop the program:  "); 
        ch = sc.nextInt();
    
        if (ch==1) 
        {
             t = new Time();
            
        }
        else if(ch==2) 
        {
             t = new Time(0,0,0);
            
        } 
        else if(ch==3) 
        {
            System.out.println("Enter hh:mm:ss:  "); 
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            int c = sc.nextInt(); 
            t.CurrentTime(a,b,c);
            
        }
        else if(ch==4) 
        {
            System.out.println("Enter hh:mm:ss:  "); 
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            int c = sc.nextInt(); 
            t.Advance(a,b,c);
            } 
        else if(ch==5) 
        {
           t.print();
            
        }  
        else if(ch==6)
        {
            break;
        }

        
    }
   while(true);
   
}
}
   
   
   
   
