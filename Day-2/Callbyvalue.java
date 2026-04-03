//here we can use arrays because it stores reference value

import java.util.Arrays;

public class Callbyvalue{
    public static void main(String args[])
    {
        int arr[]={1,2};
        swap(arr);
        System.out.println(Arrays.toString(arr));

}
 static void swap(int[] nums)
 {
    nums[0]=200;
 }
}








//we cannot swap normally using this function instead of this we can use arrays, 
// public class Callbyvalue {
//     public static void main(String args[])
//     {
//         int a=10;
//         int b=20;
//         swaps(a,b);
//         System.out.println(a+" "+b);
//     }
//     static void swaps(int a,int b)
//     {
//         int temp;
//         temp=a;
//         a=b;
//         b=temp;
//     }
// }
