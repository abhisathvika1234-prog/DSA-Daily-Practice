import java.util.*;
public class Pattern7 {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     for(int i=0;i<=n;i++)
        {
        //spaces
        for(int j=0;j<n-i;j++)
        {
            System.out.print("-");
        }
        //star
        for(int k=0;k<i*2+1;k++)
        {
         System.out.print("*");
        }
        for(int l=0;l<n-i;l++)
        {
          System.out.print("-");
        }







        
            System.out.println();
        }
   }
}


