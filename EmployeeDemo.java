import java.util.*;
class Employee
{
    String employee_number, name;
    double basic, DA, IT, netSalary;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee number:  ");
        employee_number = sc.next();
        System.out.println("Enter the name of the employee:  ");
        name = sc.next();
        System.out.println("Enter the basic salary:  ");
        basic = sc.nextFloat();
    }
    
    void Calculate()
    {
        DA = 0.75 * basic;
        IT = 0.3 * (basic + DA);
        netSalary = basic + DA - IT;
    }
    
    void output()
    {
        System.out.println("Employee number:  "+employee_number+"\n"+"Name:  "+name+"\n"+"Basic salary:  "+basic+"\n"+"DA:  "+DA+"\n"+"IT:  "+IT+"\n"+"Net Salary:  "+netSalary);
    }
    
}

class EmployeeDemo
{
    public static void main(String args[])
    {
        int i,n; Scanner sc = new Scanner(System.in);
        Employee em = new Employee(); 
        System.out.println("Enter no. of employees:   ");
        n = sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            System.out.println("Employee "+(i+1));
            em.input();
            em.Calculate();
            em.output();
            
        }
        
    }
}




















