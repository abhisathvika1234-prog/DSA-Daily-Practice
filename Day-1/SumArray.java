import java.util.*;
public class SumArray {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number of elements in an array");
       int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
        System.out.println("The Elements are:");
        for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]);
        }
        System.out.println("");
         System.out.println("The sum of Elements are:");
         int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
    
}
