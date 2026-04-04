import java.util.*;
public class Functionspractice {
    // static void arr(int nums[])
    // {
    //   nums[1]=234;
    // }
    static int num(int a, int ...var){
         System.out.println(Arrays.toString(var));
         return a;
    }

    
    public static void main(String[] args) {
        // int[] swaps={2,3,4,5};
        // arr(swaps);
        // System.out.println(Arrays.toString(swaps));
     int ans=num(23,23,45,3565);
     System.out.println(ans);
    }
}