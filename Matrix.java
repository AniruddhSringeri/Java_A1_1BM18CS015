import java.util.*;
class Matrix
{
  public static void main(String args[])
    {
      int i,j,rows,cols;
      System.out.println("Enter no. of rows:  ");
      Scanner sc = new Scanner(System.in);
      rows = sc.nextInt();
      System.out.println("Enter no. of cols:  ");
      cols = sc.nextInt();
      int mat1[][] = new int[rows][cols];
      int mat2[][] = new int[rows][cols];
      for(i=0;i<rows;i++)
        for(j=0;j<cols;j++)
        {
          System.out.println("Enter element ["+i+"]["+j+"] of matrix 1:  ");
          mat1[i][j] = sc.nextInt();
        }
      for(i=0;i<rows;i++)
        for(j=0;j<cols;j++)
        {
          System.out.println("Enter element ["+i+"]["+j+"] of matrix 2:  ");
          mat2[i][j] = sc.nextInt();
        }
      int sum[][]=new int[rows][cols];
      int sub[][]=new int[rows][cols];
      for(i=0;i<rows;i++)
        for(j=0;j<cols;j++)
          sum[i][j] = mat1[i][j]+mat2[i][j];
      
       for(i=0;i<rows;i++)
        for(j=0;j<cols;j++)
          sub[i][j] = mat1[i][j]-mat2[i][j];
      System.out.println("The sum of the two arrays is :  ");
       for(i=0;i<rows;i++)
        {
          for(j=0;j<cols;j++)
            {System.out.print(sum[i][j]+" ");}
         
          System.out.println();
        }
      System.out.println("The difference of the two arrays is :  ");
       for(i=0;i<rows;i++)
        {
          for(j=0;j<cols;j++)
            {System.out.print(sub[i][j]+" ");}
         
          System.out.println();
        }
    }
}


