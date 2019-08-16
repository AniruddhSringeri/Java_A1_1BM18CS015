//bubble sort
import java.util.*;
class OneDimensionalArray{
  public static void main(String args[])
    {
      int i,size, min=0; int temp=0; int flag=0;
      System.out.println("Enter the size of array:  ");
      Scanner sc = new Scanner(System.in);
      size = sc.nextInt();
      int arr[] = new int[size];
      System.out.println("Enter the elements of the array:  ");
      for(i=0;i<size;i++)
      {
        System.out.print("Element "+(i+1)+":");
        arr[i] = sc.nextInt();
      }
      do{ 
      for(i=0;i<size-1;i++){
        if(arr[i]>arr[i+1]){ temp=arr[i]; arr[i]=arr[i+1]; arr[i+1]=temp; ++flag;}
       }}
      while(flag!=0);
      
   
  
        
      System.out.println("The sorted array is :  ");
      System.out.print("[ ");
      for(i=0;i<size;i++)
        System.out.print(arr[i]+" ");
      System.out.println("]");
    }
}  



		
			
		
        
