class Time
{
int h,m,s;
Time()
{
  Scanner sc = new Scanner(System.in); do{System.out.println("Enter the time hh:mm:ss:  "); h = sc.nextInt(); m = sc.nextInt(); s = sc.nextInt(); } while((h>=24)||(m>=60)||(s>=60));
}

Time (int a, int b, int c){ h = a; m = b; s = c; }
void CurrentTime(int a, int b, int c) { h = a; m = b; s = c; }
void Advance (int a, int b, int c)
{
s = s+c; m = m+b+(s/60); s = s%60; h = h + a + (m/60); m = m%60; h = h%24;
}
void print() { System.out.println("The time is "+h+":"+m+":"+s);}
}


class TimeDemo
{
public static void main(String args[])
{ Scanner sc = new Scanner(System.in); System.out.println("Enter 1 for parameter-less input, 2 for parametered input, 3 for Current time, 4 for Advance: "); int ch = sc.nextInt();
  while(1){ switch(ch){ case 1: 
