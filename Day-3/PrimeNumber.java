
public class PrimeNumber {
    static boolean IsPrime(int num)
    {
     if(num<=1)
     {
        return false;
     }
     int i=2;
     while(i*i<=num)
     {
      if(num%i==0)
      {
        return false;
      }
      i++;
    }
      return true;

    
    }
    public static void main(String args[])
    {
        boolean ans=IsPrime(4);
        System.out.println(ans);
    }
}
