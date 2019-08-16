import java.util.*;
class Maximum {
  public static void main(String args[])
    {
      int i=0,j=0,rows,cols,max=0;
      System.out.println("Enter no. of rows:  ");
      Scanner sc = new Scanner(System.in);
      rows = sc.nextInt();
      System.out.println("Enter no. of columns:  ");
      cols = sc.nextInt();
      int mat[][] = new int[rows][cols];
      for(int a[]: mat)
      {
        for(int x: a)
        {
          System.out.println("Enter mat["+i+"]["+j+"]");
          mat[i][j]=sc.nextInt();
          j++;
        }
        i++;j=0;
      }
         
        max=mat[0][0];

      for(int a[]: mat)
        for(int x: a)
        { 
          if(x>max)
            max=x;
        }

      System.out.println("The maximum element in the matrix is "+max);
    }
}

          
