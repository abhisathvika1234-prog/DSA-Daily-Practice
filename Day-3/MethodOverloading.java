public class MethodOverloading {
    static void add(int a,int b)
    {
      System.out.println(a+b);
    }
    static void add(int a,int b,int c)
    {
      System.out.println(a+b+c);
    }
    static void add(int a,int b,int c,int d)
    {
      System.out.println(a+b+c+d);
    }
     
    public static void main(String[] args) {
        add(12,12);
        add(12,12,13);
        add(12,12,12,32);

    }
    

}
