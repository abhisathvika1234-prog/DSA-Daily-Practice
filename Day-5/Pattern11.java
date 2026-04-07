import java.util.*;
public class Pattern11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pat1(n);
    }

    static void pat1(int num) {
        int start;
        for(int i=1;i<=2*num-1;i++)
        {
            start=i;
            if(i<=num)
            {
                start=i; 
            }
            else
            {
               start=2*num-i; 
            }
            for(int j=1;j<=start;j++)
            {
                System.out.print("*");
            }
            System.out.println();


        }
       
    }
}
    