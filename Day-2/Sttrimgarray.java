import java.util.*;
public class Sttrimgarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter number of elements for an array");
        int n=sc.nextInt();
        String s[]=new String[n];
      System.out.println("enter names");
      for(int i=0;i<s.length;i++)
      {
        s[i]=sc.next();
      }
      System.out.println("names are");
      System.out.print(Arrays.toString(s));

    }
}
