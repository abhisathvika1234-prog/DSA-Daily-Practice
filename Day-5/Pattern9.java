import java.util.*;
public class Pattern9 {
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print("-");
            }
            for(int k=0;k<(2*num+1)-(2*i);k++)
            {
                System.out.print("*");
            }
            for(int j=0;j<i+1;j++)
            {
                System.out.print("-");
            }
            System.out.println();

        }


    }
}