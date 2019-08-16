import java.util.*;
class Rectangle {
double length,width,area;
void input()
{
    Scanner sc = new Scanner(System.in);
    length=sc.nextFloat();
    width=sc.nextFloat();
}

void computeArea()
{
    area=length*width;
}

void output()
{
    System.out.println("Length: "+length+" Width: "+width+" and the area is "+area);
}
}

class rectangleDemo {
    public static void main(String args[])
        {
            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle();
            System.out.println("Enter the length and width of rectangle 1:");
            r1.input();
            System.out.println("Enter the length and width of rectangle 2: ");
            r2.input();
            r1.computeArea();
            r2.computeArea();
            System.out.println("Rectangle 1:");
            r1.output();
            System.out.println("Rectangle 2:");
            r2.output();
        }
}
