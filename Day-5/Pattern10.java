import java.util.*;
public class Pattern10{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    pat1(n);
    pat2(n);
    }
    static void pat2(int num)
    {
        for(int i=0;i<num-1;i++)
        {
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<i+1;k++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    static void pat1(int num)
    {
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
             System.out.print("*");
            }
            for(int k=0;k<num-i-1;k++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    }