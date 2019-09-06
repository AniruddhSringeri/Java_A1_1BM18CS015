import java.util.*;
class Account {
    String name;
    int cust_no;
    double balance;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter name:  ");
        name = sc.next();
        System.out.println("Enter customer number:  ");
        cust_no = sc.nextInt();
        System.out.println("Enter balance:  ");
        balance = sc.nextFloat();
    }

    void display(){
        System.out.println("Name: "+name+"\nCustomer number: "+cust_no+"\nBalance: "+balance);
    }
}

class SavingsAccount extends Account {
    double rate;
    int time;
    SavingsAccount(double i, int t){
        this.rate = i;
        this.time = t;
        input();
    }

    SavingsAccount(){
        input();
    }

    void input(){
        super.input();
        System.out.println("Enter interest rate:  ");
        rate = sc.nextFloat();
        System.out.println("Enter time in years:  ");
        time = sc.nextInt();
    }

    void compute(){
        double newbalance;
        newbalance = (balance*time*rate)/100;
        System.out.println("New balance is "+ newbalance);
    }

    void display(){
        super.display();
        System.out.println(rate);
        System.out.println(time);
    }

}

class Account_Inheritance {
    public static void main(String args[])
    {
        SavingsAccount ob = new SavingsAccount();
        ob.compute();
        ob.display();

    }
}