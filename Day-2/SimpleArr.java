import java.util.*;
public class SimpleArr {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter number of elements for an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
      
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.print(Arrays.toString(arr));

    }
}
