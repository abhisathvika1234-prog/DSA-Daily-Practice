import java.util.*;
public class Armstrong {
    static boolean IsArmstrong(int value)
    {
        int original=value;
        int sum=0;
        int count=0;
        //count the number of digits
        while(value>0)
        {
            int temp=value%10;
            count++;
            value=value/10;
        }

        int num=original;
        while(num>0)
        {
            int digit=num%10;
            sum+=Math.pow(digit,count);
            num=num/10;
        }
        
        return original==sum;
      
    }
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int originalss=sc.nextInt();
        boolean ans=IsArmstrong(originalss);
        System.out.println(ans);

        
    }
}
