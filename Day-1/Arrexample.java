import java.util.*;
public class Arrexample {
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
        for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]);
        }
    }
    
}
