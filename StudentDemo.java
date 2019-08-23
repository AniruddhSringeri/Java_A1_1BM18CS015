import java.util.*;
class Student 
{
  String USN, name;
  int no_sub, i=0, flag;
  double SGPA, num=0; double deno=0;
  int credits[];
  int marks[];
  void input()
  {
    System.out.println("Enter the student's name and USN in order:(Name should be a single string)  ");
    Scanner sc = new Scanner(System.in);
    name = sc.next();
    USN = sc.next();
    System.out.println("Enter the no. of subjects:    ");
    no_sub = sc.nextInt();
    credits = new int[no_sub];
  marks = new int[no_sub];
    for(i=0;i<no_sub;i++)
    {
      System.out.println("Enter credits and marks scored out of 100 in subject "+(i+1));
      credits[i] = sc.nextInt();
      marks[i] = sc.nextInt();
      if (marks[i]<40) credits[i]=0;
      }
  }

  


  void sgpa()
  {
    for(i=0;i<no_sub;i++)
  { if(marks[i]>=90) marks[i]=10; else if((marks[i]<90)&&(marks[i]>=75)) marks[i] = 9; else if((marks[i]<75)&&(marks[i]>=60)) marks[i] = 8; else if((marks[i]<60)&&(marks[i]>=50)) marks[i] = 7; 
   else if((marks[i]<50)&&(marks[i]>=40)) marks[i] = 6; else flag = 0;}
    

  for(i=0;i<no_sub;i++)
    { num = num + (credits[i]*marks[i]);}
  for(i=0;i<no_sub;i++) { deno = deno+credits[i];}

  SGPA = (num/deno);

  }

  void output()
  {
      System.out.println("Student's name: "+name+"\n"+"USN: "+USN+"\n"+"SGPA: "+SGPA);
  }

}


class StudentDemo
{
  public static void main(String args[])
    { Student s = new Student(); s.input(); s.sgpa(); s.output(); }}









